package com.qmall.apple.manager.controller;

import Constants.Admin;
import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.manager.service.ShopAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 11:59
 * @function:
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	ShopAdminService shopAdminService;

	/**
	 * 管理员登录
	 * @param param
	 * @return
	 */
	@RequestMapping("/login")
	public Msg login(@RequestParam Map<String, Object> param, HttpSession session){
		String aacount = WebUtil.getParam(param, "aacount");
		String apass = WebUtil.getParam(param, "apass");

		if(Validator.isEmpty(aacount)){
			return Msg.fail().add("msg","用户名不能为空！");
		}

		if(Validator.isEmpty(apass)){
			return Msg.fail().add("msg","密码不能为空！");
		}

		ShopAdminEntity entity = new ShopAdminEntity();
		entity.setAacount(aacount);
		entity.setApass(apass);
		ShopAdmin admin = shopAdminService.login(entity);

		if(admin==null){
			return Msg.fail().add("msg","账号密码错误！");
		}

		session.setAttribute(Admin.loginAdmin,admin);

		return Msg.success().add(Admin.loginAdmin,admin);
	}

}
