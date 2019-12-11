package com.qmall.apple.manager.service.impl;

import Constants.AdminConstants;
import com.github.pagehelper.PageHelper;
import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.bean.ShopAdminExample;
import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.dao.ShopAdminMapper;
import com.qmall.apple.manager.service.ShopAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
	public ShopAdminEntity login(ShopAdmin shopAdmin) {

		ShopAdminExample example = new ShopAdminExample();
		ShopAdminExample.Criteria criteria = example.createCriteria();
		criteria.andApassEqualTo(shopAdmin.getApass());
		criteria.andAacountEqualTo(shopAdmin.getAacount());

		List<ShopAdminEntity> shopAdminEntities = shopAdminMapper.selectByExample(example);

		return shopAdminEntities.isEmpty()?null:shopAdminEntities.get(0);
	}



	/**
	 * 管理员待条件分页查询
	 * @param param
	 * @return
	 */
	@Override
	public List<ShopAdminEntity> list(Map<String, Object> param) {
		Integer pageNum = WebUtil.getIntParam(param, "pageNum", 1);
		Integer pageSize = WebUtil.getIntParam(param, "pageSize", 5);

		String aacount = WebUtil.getParam(param, "aacount");//账号
		String aname = WebUtil.getParam(param, "aname");//昵称
		String aphone = WebUtil.getParam(param, "aphone");//手机


		ShopAdminExample example = new ShopAdminExample();
		ShopAdminExample.Criteria criteria = example.createCriteria();
		criteria.andAstatusNotEqualTo(AdminConstants.STATUE_ADMIN_NOTEXIST);
		//账号
		if(Validator.isNotEmpty(aacount)){
			criteria.andAacountLike("%"+aacount+"%");
		}
		//昵称
		if(Validator.isNotEmpty(aname)){
			criteria.andAnameLike("%"+aname+"%");
		}
		//手机
		if(Validator.isNotEmpty(aphone)){
			criteria.andAphoneLike("%"+aphone+"%");
		}

		PageHelper.startPage(pageNum,pageSize);
		return shopAdminMapper.selectByExample(example);
	}
}
