package com.qmall.apple.sale.service;

import com.qmall.apple.bean.ShopOrder;
import com.qmall.apple.bean.ShopOrderDetail;

import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/18 - 17:32
 * @function:
 */
public interface OrderService {

	List<ShopOrder> list(Map<String, Object> param);

	String creatOrder(String ids, Integer userId);

	ShopOrder queryOrder(String orderId);

	String paySuccess(String orderId);

	String payTimeOut(String orderId);
}
