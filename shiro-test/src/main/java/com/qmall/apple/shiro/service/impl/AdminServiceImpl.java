package com.qmall.apple.shiro.service.impl;

import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.bean.ShopAdminExample;
import com.qmall.apple.dao.ShopAdminMapper;
import com.qmall.apple.exception.EmptyException;
import com.qmall.apple.exception.ErrException;
import com.qmall.apple.exception.MoreException;
import com.qmall.apple.shiro.service.AdminService;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author: zhouR
 * @date: Create in 2019/12/26 - 21:14
 * @function:
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	ShopAdminMapper shopAdminMapper;


	@Override
	public ShopAdmin getUserByAcount(String username) {

		ShopAdminExample example = new ShopAdminExample();
		ShopAdminExample.Criteria criteria = example.createCriteria();
		criteria.andAacountEqualTo(username);
		List<ShopAdmin> entityList = shopAdminMapper.selectByExample_Bean(example);
		return entityList.isEmpty() ? null : entityList.get(0);
	}

	/**
	 * 根据用户名查询这个用户有哪些角色
	 * @param account
	 * @return
	 */
	@Override
	public Set<String> getRolesByAccount(String account) {
		return shopAdminMapper.getRolesByAccount(account);
	}


	@Override
	public void del(String id) throws EmptyException, MoreException, ErrException {
		if(id==null){
			throw new EmptyException("id不能为空！");
		}
		if("1".equals(id)){
			throw new MoreException("账号不能重复！");
		}

		try {
			shopAdminMapper.deleteByExample(null);
		} catch (Exception e) {
			throw new ErrException("系统异常，请刷新或联系管理员！");
		}
	}


}
