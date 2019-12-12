package com.qmall.apple.manager.service;

import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.bean.ShopAdmin;

import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 16:56
 * @function:
 */
public interface ShopAdminService {

	ShopAdminEntity login(ShopAdmin shopAdmin);

	List<ShopAdminEntity> list(Map<String,Object> param);

	//批量删除
	String deleteBatchById(String ids);

	//修改用户状态
	String changeStatus(int userId, String status);
}
