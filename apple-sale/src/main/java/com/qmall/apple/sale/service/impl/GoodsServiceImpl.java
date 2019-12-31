package com.qmall.apple.sale.service.impl;

import Constants.SaleConstants;
import com.github.pagehelper.PageHelper;
import com.qmall.apple.bean.ShopGoods;
import com.qmall.apple.bean.ShopGoodsExample;
import com.qmall.apple.utils.Validator;
import com.qmall.apple.utils.WebUtil;
import com.qmall.apple.utils.calcUtil;
import com.qmall.apple.dao.ShopGoodsMapper;
import com.qmall.apple.sale.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 15:50
 * @function:
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	ShopGoodsMapper shopGoodsMapper;

	/**
	 * 带条件查询列表
	 * @param param
	 * @return
	 */
	@Override
	public List<ShopGoods> list(Map<String,Object> param) {
		//分页信息
		Integer pageNum = WebUtil.getIntParam(param, "pageNum", 1);
		Integer pageSize = WebUtil.getIntParam(param, "pageSize", 5);

		//查询条件
		Integer typeid = WebUtil.getIntParam(param, "typeid", -1); //类型
		Integer gsex = WebUtil.getIntParam(param, "gsex", -1);//男女童装
		Integer glabel = WebUtil.getIntParam(param, "glabel", -1); //热门2爆款1折扣3

		//商品模糊查询
		String shopInfo = WebUtil.getParam(param, "shopInfo");

		//价格区间
		String minString = WebUtil.getParam(param,"min");//最小的价格
		String maxString = WebUtil.getParam(param,"max");//最大的价格

		//排序
		String gprice_desc = WebUtil.getParam(param, "gprice_desc"); //倒序价格
		String gname_desc = WebUtil.getParam(param,"gname_desc");//商品名称-排序


		ShopGoodsExample example = new ShopGoodsExample();
		ShopGoodsExample.Criteria criteria = example.createCriteria();
		criteria.andIsdeleteEqualTo(SaleConstants.GOODS_INUSE);
		//类型
		if(typeid!=-1){
			criteria.andGtypeEqualTo(typeid);
		}
		//男女童
		if(gsex!=-1){
			criteria.andGsexEqualTo(gsex);
		}
		//折扣分类（爆款
		if(glabel!=-1){
			criteria.andGlabelEqualTo(glabel);
		}

		//商品名模糊查询
		if(Validator.isNotEmpty(shopInfo)){
			criteria.andGnameLike("%"+shopInfo+"%");
		}

		//价格大于等于最小价格
		if(Validator.isNotEmpty(minString)){
			Float min = calcUtil.StringToFloat(minString);
			criteria.andGpriceGreaterThanOrEqualTo(min);
		}
		//价格小于最大价格
		if(Validator.isNotEmpty(maxString)){
			Float max = calcUtil.StringToFloat(maxString);
			criteria.andGpriceLessThanOrEqualTo(max);
		}

		//价格排序
		if(Validator.isNotEmpty(gprice_desc)){
			example.setOrderByClause("gprice desc");
		}

		//名称排序
		if(Validator.isNotEmpty(gname_desc)){
			example.setOrderByClause("gname desc");
		}

		PageHelper.startPage(pageNum,pageSize);
		return shopGoodsMapper.selectByExample(example);
	}


	/**
	 * 查询所有商品
	 * @return
	 */
	@Override
	public List<ShopGoods> queryAllGoodsList() {
		return shopGoodsMapper.selectByExample(null);
	}

	@Override
	public ShopGoods getEntityById(String goodsId) {
		return shopGoodsMapper.selectByPrimaryKey_WithType(goodsId);
	}
}
