package com.qmall.apple.sale.controller;

import Constants.SaleConstants;
import com.github.pagehelper.PageInfo;
import com.qmall.apple.bean.ShopOrder;
import com.qmall.apple.bean.ShopOrderDetail;
import com.qmall.apple.commons.DateTimeUtil;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.sale.service.OrderService;
import com.qmall.apple.sale.timer.OrderTimer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;

/**
 * @author: zhouR
 * @date: Create in 2019/12/18 - 17:31
 * @function:
 */
@RestController
@RequestMapping("/order")
@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
public class OrderController {

	@Autowired
	OrderService orderService;

	/**
	 * 获取订单创建的时间  单位:毫秒
	 * @return
	 */
	@RequestMapping("/getlimitTime")
	public Msg getOrderTime(String orderId){
		ShopOrder shopOrder = orderService.queryOrder(orderId);
		Date odate = shopOrder.getOdate();

		long startToNow = DateTimeUtil.betweenMillis(odate);  //毫秒
		long limitTime = SaleConstants.TIME_30M - startToNow;	//拿30分钟减去
		return Msg.success().add("limitTime",limitTime);
	}

	/**
	 * 创建订单
	 * @param param
	 * @return
	 */
	@RequestMapping("/creatOrder")
	public Msg creatOrder(@RequestParam Map<String, Object> param, HttpSession session) {
		Integer userId = WebUtil.getIntParam(param, "userId"); //用户id
		String ids = WebUtil.getParam(param, "ids");//购物车id

		String orderId = orderService.creatOrder(ids, userId);

		//设置一个订单超时的时间点;30分钟后订单自动关闭
		//1: 订单创建成功以后,设置一个计时器;计时器30分钟;
		//2: 30分钟以后,订单失效; 就是修改订单的状态为 4; 就代表当前定时已经失效了;
		//3: 如果用户在指定的时间内支付成功;必须要取消这个计时器;
		Timer timer = new Timer();
		OrderTimer orderTimer = new OrderTimer(timer,orderId);

		//执行任务; 创建订单成功以后,.30秒以后将订单设置为失效
		timer.schedule(orderTimer,30*60*1000); // 30*60*1000
		//将定时器放在map中
		Map<String,Timer> map = (Map<String,Timer>)session.getServletContext().getAttribute(SaleConstants.TIMER_MAP);
		map.put(orderId,timer);


		return Msg.success().add("ret", orderId);
	}


	/**
	 * 支付成功
	 * @param orderId
	 * @return
	 */
	@RequestMapping("/pay")
	public Msg afterPay(String orderId,HttpSession session) {
		if(Validator.isNull(orderId)){
			return Msg.fail().add("ret","empty");
		}
		String ret = orderService.paySuccess(orderId);
		if("ok".equals(ret)){
			//获取容器中的计时器
			Map<String,Timer> map = (Map<String,Timer>)session.getServletContext().getAttribute(SaleConstants.TIMER_MAP);
			map.get(orderId).cancel();//关闭定时器
			map.remove(orderId);//从map中移除这个订单对应的定时器
		}
		return Msg.success().add("ret",ret);
	}


	/**
	 * 查询订单列表
	 *
	 * @param param
	 * @return
	 */
	@RequestMapping("/list")
	public Msg list(@RequestParam Map<String, Object> param) {
		List<ShopOrder> list = orderService.list(param);
		PageInfo<ShopOrder> pageInfo = new PageInfo<>(list, 5);
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 根据订单id查询详情
	 * @param orderId
	 * @return
	 */
	@RequestMapping("/queryOrder")
	public Msg queryOrder(String orderId) {
		if(Validator.isNull(orderId)){
			return Msg.fail();
		}
		ShopOrder entity = orderService.queryOrder(orderId);
		return Msg.success().add("entity",entity);
	}







}
