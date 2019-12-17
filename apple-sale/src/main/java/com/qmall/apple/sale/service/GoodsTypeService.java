package com.qmall.apple.sale.service;

import com.qmall.apple.bean.ShopGoodsType;

import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 16:47
 * @function:
 */
public interface GoodsTypeService {

	/**
	 * 查询所有类别
	 * @return
	 */
	List<ShopGoodsType> queryAllGoodsTypeList();
}
