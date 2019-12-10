package com.qmall.apple.manager.controller;

import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.manager.service.ShopAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 11:59
 * @function:
 */
@Controller
public class HelloController {

	@Autowired
	ShopAdminService shopAdminService;



	@RequestMapping("/login")
	@ResponseBody
	public String hello(){

		ShopAdminEntity shopAdmin = new ShopAdminEntity();
		shopAdmin.setAacount("tom2");
		shopAdmin.setApass("666");
		shopAdminService.login(shopAdmin);
		return "success!";
	}

}
