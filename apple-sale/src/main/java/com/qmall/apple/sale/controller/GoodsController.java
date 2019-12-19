package com.qmall.apple.sale.controller;

import Constants.SaleConstants;
import com.github.pagehelper.PageInfo;
import com.qmall.apple.bean.ShopGoods;
import com.qmall.apple.bean.ShopGoodsType;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.sale.service.CartService;
import com.qmall.apple.sale.service.GoodsService;
import com.qmall.apple.sale.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 15:49
 * @function: 商品列表
 */
@RestController
@RequestMapping("/goods")
@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
public class GoodsController {


	@Autowired
	GoodsService goodsService;
	@Autowired
	GoodsTypeService goodsTypeService;

	/**
	 * 主页
	 * @param param
	 * @return
	 */
	@RequestMapping("/index")
	public Msg index(@RequestParam Map<String,Object> param){

		int glabel = WebUtil.getIntParam(param,"glabel",-1);

		//查询商品类别列表 只查询3个类别
		List<ShopGoodsType> list1 = goodsTypeService.queryAllGoodsTypeList();
		List<ShopGoodsType> threeType = list1.stream()
				.limit(3)
				.collect(Collectors.toList());


		//查询6个商品;
		List<ShopGoods> list2 = goodsService.queryAllGoodsList();
		Stream<ShopGoods> stream = list2.stream()
				.filter((x) -> x.getIsdelete()==SaleConstants.GOODS_INUSE);
		if(glabel!=-1){
			stream = stream.filter((x) -> x.getGlabel()==glabel);
		}
		List<ShopGoods> goodsList = stream.limit(8).collect(Collectors.toList());

		return Msg.success()
				.add("type",threeType)
				.add("list",goodsList);
	}


	/**
	 * 带条件查询
	 * @param param
	 * @return
	 */
	@RequestMapping("/list")
	public Msg list(@RequestParam Map<String,Object> param){
		//查询商品列表
		List<ShopGoods> list = goodsService.list(param);
		PageInfo<ShopGoods> pageInfo = new PageInfo<>(list,5);
		return Msg.success().add("pageInfo",pageInfo);
	}



	/**
	 * 根据商品id查询
	 * @param goodsId
	 * @return
	 */
	@RequestMapping("/queryById")
	public Msg queryById(String goodsId){
		//查询商品列表
		ShopGoods entity =  goodsService.getEntityById(goodsId);
		return Msg.success().add("entity",entity);
	}








}
