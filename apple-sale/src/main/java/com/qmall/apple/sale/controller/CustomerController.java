package com.qmall.apple.sale.controller;

import com.qmall.apple.bean.ShopCustomer;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.sale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zhouR
 * @date: Create in 2019/12/17 - 16:09
 * @function: 用户信息处理
 */
@RestController
@RequestMapping("/cunstomer")
@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/repass")
	public Msg repass(HttpServletRequest request){
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String ret = customerService.repass(Integer.parseInt(userId),password);
		return Msg.success().add("ret",ret);
	}

	@RequestMapping("/login")
	public Msg login(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ShopCustomer entity = customerService.login(username,password);
		if(entity==null){
			return Msg.fail();
		}
		return Msg.success().add("entity",entity);
	}


	@RequestMapping("/regist")
	public Msg regist(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String ret = customerService.regist(username,password);
		return Msg.success().add("ret",ret);
	}




}
