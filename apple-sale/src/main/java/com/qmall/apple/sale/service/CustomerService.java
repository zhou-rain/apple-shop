package com.qmall.apple.sale.service;

import com.qmall.apple.bean.ShopCustomer;

/**
 * @author: zhouR
 * @date: Create in 2019/12/19 - 19:51
 * @function:
 */
public interface CustomerService {
	ShopCustomer login(String username, String password);

	String regist(String username, String password);

	String repass(int userId, String password);
}
