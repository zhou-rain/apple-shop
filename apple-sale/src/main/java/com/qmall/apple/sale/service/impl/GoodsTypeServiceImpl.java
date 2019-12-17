package com.qmall.apple.sale.service.impl;

import com.qmall.apple.bean.ShopGoodsType;
import com.qmall.apple.dao.ShopGoodsTypeMapper;
import com.qmall.apple.sale.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 16:47
 * @function:
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

	@Autowired
	ShopGoodsTypeMapper shopGoodsTypeMapper;

	@Override
	public List<ShopGoodsType> queryAllGoodsTypeList() {
		return shopGoodsTypeMapper.selectByExample(null);
	}
}
