package com.qmall.apple.sale.controller;

import com.qmall.apple.bean.ShopCart;
import com.qmall.apple.bean.ShopGoods;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.sale.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/17 - 16:53
 * @function: 购物车
 */
@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
public class CartController {

	@Autowired
	CartService cartService;




	/**
	 * 添加购物车
	 *
	 * @param param
	 * @return
	 */
	@RequestMapping("/add")
	public Msg add(@RequestParam Map<String, Object> param) {
		String gid = WebUtil.getParam(param, "gid");//商品id
		int cid = WebUtil.getIntParam(param, "userId");//用户id

		String ret = cartService.addCart(gid, cid);

		if ("ok".equals(ret)) {
			List<ShopCart> list = cartService.getCartByCustomerId(cid);
			Map<String, String> calc = calc(list);
			return Msg.success().add("list", list).add("calc",calc);
		} else {
			return Msg.success().add("ret", ret);
		}
	}


	/**
	 * 减少购物车
	 *
	 * @param param
	 * @return
	 */
	@RequestMapping("/reduce")
	public Msg reduce(@RequestParam Map<String, Object> param) {
		String gid = WebUtil.getParam(param, "gid");//商品id
		int cid = WebUtil.getIntParam(param, "userId");//用户id

		String ret = cartService.reduceCart(gid, cid);

		if ("ok".equals(ret)) {
			List<ShopCart> list = cartService.getCartByCustomerId(cid);
			Map<String, String> calc = calc(list);
			return Msg.success().add("list", list).add("calc",calc);
		} else {
			return Msg.success().add("ret", ret);
		}
	}


	/**
	 * 查询购物车
	 *
	 * @param userId 用户id
	 * @return
	 */
	@RequestMapping("/query")
	public Msg query(int userId) {
		List<ShopCart> list = cartService.getCartByCustomerId(userId);
		Map<String, String> calc = calc(list);
		return Msg.success().add("list", list).add("calc",calc);
	}


	/**
	 * 清空购物车
	 *
	 * @param userId   用户id
	 * @return
	 */
	@RequestMapping("/clear")
	public Msg clear(int userId) {
		String ret = cartService.clear(userId);
		return Msg.success().add("ret", ret);
	}



	/**
	 * 计算购物车的总件数和总价
	 * @param list
	 * @return
	 */
	private Map<String, String> calc(List<ShopCart> list) {
		Map<String, String> map = new HashMap<>();

		int totalCount = 0;// 计算总件数
		float totalMoney = 0f; //计算总金额

		for (ShopCart cart : list) {
			ShopGoods goods = cart.getGoods();

			Float gdiscount = goods.getGdiscount();    //折扣
			Float gprice = goods.getGprice();//价格
			Integer quantity = cart.getQuantity(); //数量

			totalCount += cart.getQuantity();
			totalMoney += gdiscount*gprice*quantity;
		}

		map.put("totalCount", String.valueOf(totalCount));
		map.put("totalMoney", String.valueOf(totalMoney));
		return map;
	}


	/**
	 * 定时器
	 * @param userId
	 * @return
	 */
	@Scheduled(cron = "0 */1 * * * ?")
	public String time(int userId) {



		return "";
	}






}
