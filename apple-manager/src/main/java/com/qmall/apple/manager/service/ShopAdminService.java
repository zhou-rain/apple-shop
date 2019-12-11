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
}
