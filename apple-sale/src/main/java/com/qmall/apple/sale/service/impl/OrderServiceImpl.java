package com.qmall.apple.sale.service.impl;

import Constants.SaleConstants;
import com.github.pagehelper.PageHelper;
import com.qmall.apple.bean.*;
import com.qmall.apple.utils.ArrayUtil;
import com.qmall.apple.utils.DateUtil;
import com.qmall.apple.utils.StringUtil;
import com.qmall.apple.utils.WebUtil;
import com.qmall.apple.dao.ShopCartMapper;
import com.qmall.apple.dao.ShopOrderDetailMapper;
import com.qmall.apple.dao.ShopOrderMapper;
import com.qmall.apple.sale.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/18 - 17:33
 * @function:
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	ShopCartMapper shopCartMapper;//购物车
	@Autowired
	ShopOrderDetailMapper shopOrderDetailMapper; //订单详情
	@Autowired
	ShopOrderMapper shopOrderMapper;//订单表

	/**
	 * 创建订单  必须要在一个事务中
	 * @param ids 购物车ID
	 * @param userId 用户id
	 * @return 返回订单号
	 */
	@Override
	public String creatOrder(String ids, Integer userId) {
		//订单id号
		String orderId = StringUtil.uuid();
		try {
			//新建订单信息。（自定义id） new Order()
			ShopOrder shopOrder = new ShopOrder();
			shopOrder.setOid(orderId); //自定义id
			shopOrder.setAid(userId);//用户id
			shopOrder.setAddressid(1);//地址
			shopOrder.setOdate(DateUtil.formatSQLtime(new Date()));//当前时间

			Float total = calcTotal(ids);
			if(total==-1f){
				//判断购物车是否存在
				return "empty";
			}
			shopOrder.setOtotal(total);//订单总价
			shopOrderMapper.insertSelective(shopOrder);

			//根据id获取所有的购物车信息  遍历每个购物车，list
			List<Integer> certIds = ArrayUtil.StringToIntegerList(ids);
			for (Integer id : certIds) {
				//获取每一个购物车
				ShopCart cart = shopCartMapper.selectCart_ByPrimaryKey_WithGoods(id);
				ShopGoods goods = cart.getGoods();
				Float gprice = goods.getGprice();//商品单价
				Float gdiscount = goods.getGdiscount();//商品折扣
				String gid = goods.getGid();//商品id
				Integer quantity = cart.getQuantity();//商品数量

				//每个商品的总价
				float each_total = gdiscount * gprice * quantity;

				//新建商品详情表
				ShopOrderDetail detail = new ShopOrderDetail();
				detail.setOdid(StringUtil.uuid());
				detail.setOid(orderId);
				detail.setGid(gid);//商品id
				detail.setOdnumber(quantity);//数量
				detail.setOdprice(each_total);//当前商品的总数量
				shopOrderDetailMapper.insertSelective(detail);

				//将当前的购物车删掉
				shopCartMapper.deleteByPrimaryKey(id);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
		return orderId;
	}

	/**
	 * 计算总价
	 * @param ids
	 * @return
	 */
	private Float calcTotal(String ids){
		List<Integer> certIds = ArrayUtil.StringToIntegerList(ids);
		float ototal = 0f;//记录订单总价
		for (Integer id : certIds) {
			//获取每一个购物车
			ShopCart cart = shopCartMapper.selectCart_ByPrimaryKey_WithGoods(id);
			if(cart==null){
				return -1f;
			}
			ShopGoods goods = cart.getGoods();
			Float gprice = goods.getGprice();//商品单价
			Float gdiscount = goods.getGdiscount();//商品折扣
			Integer quantity = cart.getQuantity();//商品数量
			//每个商品的总价
			float each_total = gdiscount * gprice * quantity;
			//累计订单总价
			ototal+=each_total;
		}
		return ototal;
	}

	/**
	 *根据订单号查询
	 * @param orderId
	 * @return
	 */
	@Override
	public ShopOrder queryOrder(String orderId) {
		return shopOrderMapper.selectByPrimaryKey_With_Detail(orderId);
	}


	/**
	 * 支付
	 * @param orderId
	 * @return
	 */
	@Override
	public String paySuccess(String orderId) {

		//验证订单超时
		try {
			ShopOrder order = shopOrderMapper.selectByPrimaryKey(orderId);

			if(order==null){
				return "empty";
			}

			//判断订单状态
			if (order.getOstatus().equals(SaleConstants.ORDER_STATUS_NOTPAY)) {
				//还未支付，可支付
				ShopOrder entity = new ShopOrder();
				entity.setOstatus(SaleConstants.ORDER_STATUS_PAY);
				entity.setOid(orderId);
				shopOrderMapper.updateByPrimaryKeySelective(entity);
			}else {
				return "timeout";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}

		return "ok";
	}

	/**
	 * 订单失效
	 * @param orderId
	 * @return
	 */
	@Override
	public String payTimeOut(String orderId) {
		ShopOrder shopOrder = new ShopOrder();
		shopOrder.setOid(orderId);
		shopOrder.setOstatus(SaleConstants.ORDER_STATUS_TIMEOUT);
		try {
			shopOrderMapper.updateByPrimaryKeySelective(shopOrder);
		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
		return "ok";
	}

	


	/**
	 * 订单列表
	 * @param param
	 * @return
	 */
	@Override
	public List<ShopOrder> list(Map<String, Object> param) {
		Integer pageSize = WebUtil.getIntParam(param, "pageSize");
		Integer pageNum = WebUtil.getIntParam(param, "pageNum");

		Integer userId = WebUtil.getIntParam(param, "userId"); //用户id

		ShopOrderExample example = new ShopOrderExample();
		ShopOrderExample.Criteria criteria = example.createCriteria();
		criteria.andAidEqualTo(userId);
		example.setOrderByClause("ostatus asc,odate desc");

		PageHelper.startPage(pageNum,pageSize);
		return shopOrderMapper.selectByExample(example);
	}



	
	
	
	
}
