package com.qmall.apple.sale.controller;

import com.github.pagehelper.PageInfo;
import com.qmall.apple.bean.ShopOrder;
import com.qmall.apple.bean.ShopOrderDetail;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.sale.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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
	 * 创建订单
	 *
	 * @param param
	 * @return
	 */
	@RequestMapping("/creatOrder")
	public Msg creatOrder(@RequestParam Map<String, Object> param) {
		Integer userId = WebUtil.getIntParam(param, "userId"); //用户id
		String ids = WebUtil.getParam(param, "ids");//购物车id

		String ret = orderService.creatOrder(ids, userId);
		return Msg.success().add("ret", ret);
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


	/**
	 * 支付成功
	 * @param orderId
	 * @return
	 */
	@RequestMapping("/pay")
	public Msg afterPay(String orderId) {
		if(Validator.isNull(orderId)){
			return Msg.fail().add("ret","empty");
		}
		String ret = orderService.paySuccess(orderId);
		return Msg.success().add("ret",ret);
	}




}
