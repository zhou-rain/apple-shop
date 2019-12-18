package com.qmall.apple.sale.service;

import com.qmall.apple.bean.ShopCart;

import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/17 - 16:52
 * @function:
 */
public interface CartService {

	//查询购物车
	List<ShopCart> getCartByCustomerId(int userId);

	//添加购物车
	String addCart(String gid, int userId);

	//减少购物车
	String reduceCart(String gid, int userId);

	//清空购物车
	String clear(int userId);


}
