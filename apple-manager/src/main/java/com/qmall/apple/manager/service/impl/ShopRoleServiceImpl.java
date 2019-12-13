package com.qmall.apple.manager.service.impl;

import Constants.AdminConstants;
import com.github.pagehelper.PageHelper;
import com.qmall.apple.Entity.ShopRoleEntity;
import com.qmall.apple.bean.ShopAdminExample;
import com.qmall.apple.bean.ShopRoleExample;
import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.dao.ShopRoleMapper;
import com.qmall.apple.manager.service.ShopRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 17:11
 * @function:
 */
@Service
public class ShopRoleServiceImpl implements ShopRoleService {

	@Autowired
	ShopRoleMapper shopRoleMapper;


	@Override
	public List<ShopRoleEntity> list(Map<String, Object> param) {
		Integer pageNum = WebUtil.getIntParam(param, "pageNum", 1);
		Integer pageSize = WebUtil.getIntParam(param, "pageSize", 5);

		String rname = WebUtil.getParam(param, "rname");//角色名称
		String rdesc = WebUtil.getParam(param, "rdesc");//说明

		ShopRoleExample example = new ShopRoleExample();
		ShopRoleExample.Criteria criteria = example.createCriteria();
		//角色名称
		if(Validator.isNotEmpty(rname)){
			criteria.andRnameLike("%"+rname+"%");
		}
		//说明
		if(Validator.isNotEmpty(rdesc)){
			criteria.andRdescLike("%"+rdesc+"%");
		}

		PageHelper.startPage(pageNum,pageSize);
		return shopRoleMapper.selectByExample(example);
	}

	@Override
	public List<ShopRoleEntity> getAllRoleList() {
		return shopRoleMapper.selectByExample(null);
	}
}
