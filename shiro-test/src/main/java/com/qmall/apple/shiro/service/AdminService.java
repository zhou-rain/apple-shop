package com.qmall.apple.shiro.service;

import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.exception.EmptyException;
import com.qmall.apple.exception.ErrException;
import com.qmall.apple.exception.MoreException;

import java.util.Set;

/**
 * @author: zhouR
 * @date: Create in 2019/12/26 - 21:14
 * @function:
 */
public interface AdminService {
	ShopAdmin getUserByAcount(String acount);

	/**
	 * 根据用户名查询这个用户有哪些角色
	 * @param acount
	 * @return
	 */
	Set<String> getRolesByAccount(String acount);

	void del(String id) throws EmptyException, MoreException, ErrException;
}
