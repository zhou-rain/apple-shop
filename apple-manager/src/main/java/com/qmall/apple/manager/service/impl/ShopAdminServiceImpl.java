package com.qmall.apple.manager.service.impl;

import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.bean.ShopAdminExample;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.dao.ShopAdminMapper;
import com.qmall.apple.manager.service.ShopAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 16:56
 * @function:
 */
@Service
public class ShopAdminServiceImpl implements ShopAdminService {

	@Autowired
	ShopAdminMapper shopAdminMapper;

	@Override
	public ShopAdmin login(ShopAdminEntity shopAdmin) {

		ShopAdminExample example = new ShopAdminExample();
		ShopAdminExample.Criteria criteria = example.createCriteria();
		criteria.andApassEqualTo(shopAdmin.getApass());
		criteria.andAacountEqualTo(shopAdmin.getAacount());

		List<ShopAdmin> shopAdmins = shopAdminMapper.selectByExample(example);

		return shopAdmins.isEmpty()?null:shopAdmins.get(0);
	}
}
