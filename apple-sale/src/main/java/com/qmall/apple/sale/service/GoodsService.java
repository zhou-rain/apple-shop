package com.qmall.apple.sale.service;

import com.qmall.apple.bean.ShopGoods;
import com.qmall.apple.bean.ShopGoodsType;
import com.qmall.apple.bean.ShopGoodsTypeExample;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 15:49
 * @function:
 */
public interface GoodsService {
	/**
	 * 带条件查询列表
	 * @param param
	 * @return
	 */
	List<ShopGoods> list(Map<String,Object> param);


	/**
	 * 查询所有商品
	 * @return
	 */
	List<ShopGoods> queryAllGoodsList();


}
