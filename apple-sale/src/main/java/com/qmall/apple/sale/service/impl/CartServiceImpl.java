package com.qmall.apple.sale.service.impl;

import com.qmall.apple.bean.ShopCart;
import com.qmall.apple.bean.ShopCartExample;
import com.qmall.apple.commons.DateUtil;
import com.qmall.apple.dao.ShopCartMapper;
import com.qmall.apple.sale.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/17 - 16:53
 * @function:
 */
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	ShopCartMapper shopCartMapper;//购物车

	/**
	 * 根据用户id获取对应的购物车信息
	 * @param cid
	 * @return
	 */
	@Override
	public List<ShopCart> getCartByCustomerId(int cid) {
		return shopCartMapper.selectCart_ByCustomerId_WithGoods(cid);
	}

	/**
	 * 添加购物车
	 * @param gid
	 * @param cid
	 * @return
	 */
	@Override
	public String addCart(String gid, int cid) {
		//先查询有没有这个用户的这个商品
		try {
			if(isEmpty(gid, cid)){
				//如果没有，新增一条数据
				ShopCart cart = new ShopCart();
				cart.setStatus(1);
				cart.setQuantity(1);
				cart.setGoodsId(gid);
				cart.setCustomerId(cid);
				cart.setDateTime(DateUtil.formatSQLtime(new Date()));
				shopCartMapper.insert(cart);
			}else {
				//如果有，数量加1
				ShopCart cart = shopCartMapper.selectByGidAndCid(gid,cid);
				cart.setQuantity(cart.getQuantity()+1);
				shopCartMapper.updateByPrimaryKey(cart);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
		return "ok";
	}

	/**
	 * 减少购物车
	 * @param gid
	 * @param cid
	 * @return
	 */
	@Override
	public String reduceCart(String gid, int cid) {
		if(isEmpty(gid, cid))
			//如果没有,提示错误
			return "err";
		try {
			//如果有，查询数量
			ShopCart cart = shopCartMapper.selectByGidAndCid(gid,cid);
			Integer quantity = cart.getQuantity();
			if(quantity>1){
				//数量大于1   减少1
				cart.setQuantity(quantity-1);
				shopCartMapper.updateByPrimaryKey(cart);
			}else {
				//数量等于1  删除
				shopCartMapper.deleteByPrimaryKey(cart.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
		return "ok";
	}

	/**
	 * 清空购物车
	 * @param cid
	 * @return
	 */
	@Override
	public String clear(int cid) {
		ShopCartExample example = new ShopCartExample();
		ShopCartExample.Criteria criteria = example.createCriteria();
		criteria.andCustomerIdEqualTo(cid);
		try {
			shopCartMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
		return "ok";
	}




	/**
	 *	根据用户id 和 商品id 重复性校验
	 * @param gid
	 * @param cid
	 * @return
	 */
	public boolean isEmpty(String gid, int cid){
		ShopCartExample example = new ShopCartExample();
		ShopCartExample.Criteria criteria = example.createCriteria();
		criteria.andCustomerIdEqualTo(cid);
		criteria.andGoodsIdEqualTo(gid);
		List<ShopCart> carts = shopCartMapper.selectByExample(example);
		return carts.isEmpty();
	}



}
