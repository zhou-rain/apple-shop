package com.qmall.apple.manager.service;

import com.qmall.apple.Entity.ShopRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 17:11
 * @function:
 */
public interface ShopRoleService {
	List<ShopRoleEntity> list(Map<String, Object> param);

	List<ShopRoleEntity> getAllRoleList();

	String delBatch(String ids);
}
