package com.qmall.apple.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.qmall.apple.Entity.ShopRoleEntity;
import com.qmall.apple.bean.*;
import com.qmall.apple.utils.ArrayUtil;
import com.qmall.apple.utils.Validator;
import com.qmall.apple.utils.WebUtil;
import com.qmall.apple.dao.ShopAdminRoleMapper;
import com.qmall.apple.dao.ShopRoleAuthMapper;
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
	@Autowired
	ShopAdminRoleMapper shopAdminRoleMapper;
	@Autowired
	ShopRoleAuthMapper shopRoleAuthMapper;


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

	/**
	 * 删除角色
	 * @param ids
	 * @return
	 */
	@Override
	public String delBatch(String ids) {
		List<Integer> idlist = ArrayUtil.StringToIntegerList(ids);

		try {
			//删除角色权限表
			ShopAdminRoleExample shopAdminRoleExample = new ShopAdminRoleExample();
			ShopAdminRoleExample.Criteria criteria1 = shopAdminRoleExample.createCriteria();
			criteria1.andRidIn(idlist);
			shopAdminRoleMapper.deleteByExample(shopAdminRoleExample);

			//删除角色用户表
			ShopRoleAuthExample shopRoleAuthExample = new ShopRoleAuthExample();
			ShopRoleAuthExample.Criteria criteria2 = shopRoleAuthExample.createCriteria();
			criteria2.andRidIn(idlist);
			shopRoleAuthMapper.deleteByExample(shopRoleAuthExample);

			//删除角色
			ShopRoleExample shopRoleExample = new ShopRoleExample();
			ShopRoleExample.Criteria criteria3 = shopRoleExample.createCriteria();
			criteria3.andRidIn(idlist);
			shopRoleMapper.deleteByExample(shopRoleExample);
		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}


		return "ok";
	}
}
