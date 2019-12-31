package com.qmall.apple.shiro.controller;

import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.utils.Validator;
import com.qmall.apple.utils.WebUtil;
import com.qmall.apple.exception.MsgException;
import com.qmall.apple.shiro.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/26 - 17:54
 * @function:
 */
@RestController
@RequestMapping("/shiro")
public class AdminController {

	@Autowired
	AdminService adminService;

	/**
	 * 登录
	 * @param param
	 * @return
	 */
	@RequestMapping("/login")
	public Msg login(@RequestParam Map<String,Object> param){
		String aacount = WebUtil.getParam(param, "aacount");
		String apass = WebUtil.getParam(param, "apass");

		//系统异常
		if(Validator.isEmpty(aacount) || Validator.isEmpty(apass)){
			return Msg.fail().add("ret","系统异常，请刷新或联系管理员！");
		}
		//subject  当前用户
		Subject subject = SecurityUtils.getSubject();

		//代表当前用户没有认证
		if (!subject.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(aacount, apass);
			token.setRememberMe(true); //记住我

			//登录
			try {
				subject.login(token);
			} catch (AccountException e) {
				return Msg.fail().add("ret",e.getMessage());
			}

			//如果登录成功
			if (subject.isAuthenticated()) {
				//用户信息
				ShopAdmin userInfo = adminService.getUserByAcount(aacount);
				//权限信息
				return Msg.success().add("userInfo",userInfo);
			}

		}
		return Msg.fail();
	}



	@RequestMapping("/del")
	public Msg del(@RequestParam Map<String,Object> param){

		try {
			adminService.del("1");
		} catch (MsgException e) {
			return Msg.fail().add("ret",e.getMessage());
		}
		return Msg.success();
	}


	//@RequiresRoles({"admin"})

	
}
