package com.qmall.apple.sale.controller;

import Constants.SaleConstants;
import com.github.pagehelper.PageInfo;
import com.qmall.apple.bean.ShopOrder;
import com.qmall.apple.utils.DateTimeUtil;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.utils.Validator;
import com.qmall.apple.utils.WebUtil;
import com.qmall.apple.sale.service.OrderService;
import com.qmall.apple.sale.timer.OrderTimer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
		long limitTime = SaleConstants.ORDER_OUT_TIME - startToNow;	//拿总失效时间相减
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

		//3分钟后订单自动关闭
		Timer timer = new Timer();
		OrderTimer orderTimer = new OrderTimer(timer,orderId);

		//执行任务; 创建订单成功以后,.3分钟后将订单设置为失效
		timer.schedule(orderTimer,SaleConstants.ORDER_OUT_TIME);
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
