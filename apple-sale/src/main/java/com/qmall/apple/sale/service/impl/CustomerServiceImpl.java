package com.qmall.apple.sale.service.impl;

import com.qmall.apple.bean.ShopCustomer;
import com.qmall.apple.bean.ShopCustomerExample;
import com.qmall.apple.dao.ShopCustomerMapper;
import com.qmall.apple.sale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/19 - 19:52
 * @function:
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	ShopCustomerMapper shopCustomerMapper;


	@Override
	public ShopCustomer login(String username, String password) {
		ShopCustomerExample example = new ShopCustomerExample();
		ShopCustomerExample.Criteria criteria = example.createCriteria();
		criteria.andAnameEqualTo(username);
		criteria.andApassEqualTo(password);
		List<ShopCustomer> shopCustomers = shopCustomerMapper.selectByExample(example);
		if(shopCustomers.isEmpty()){
			return null;
		}
		return shopCustomers.get(0);
	}


	@Override
	public String regist(String username, String password) {
		ShopCustomer shopCustomer = new ShopCustomer();
		shopCustomer.setAname(username);
		shopCustomer.setApass(password);

		if(!isEmpty(shopCustomer)){
			return "more";
		}
		try {
			shopCustomerMapper.insertSelective(shopCustomer);
		} catch (Exception e) {
			e.printStackTrace();
			return "err";
		}

		return "ok";
	}


	/**
	 * 重复性校验  true/false 不存在/存在
	 * @param shopCustomer
	 * @return
	 */
	public Boolean isEmpty(ShopCustomer shopCustomer){
		ShopCustomerExample example = new ShopCustomerExample();
		ShopCustomerExample.Criteria criteria = example.createCriteria();
		if(shopCustomer.getAid()!=null){
			criteria.andAidNotEqualTo(shopCustomer.getAid());
		}
		criteria.andAnameEqualTo(shopCustomer.getAname());
		List<ShopCustomer> shopCustomers = shopCustomerMapper.selectByExample(example);
		return shopCustomers.isEmpty();
	}

}
