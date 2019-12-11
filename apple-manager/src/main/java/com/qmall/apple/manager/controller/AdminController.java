package com.qmall.apple.manager.controller;


import Constants.AdminConstants;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import java.util.List;
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
	 * 删除
	 * @param param
	 * @return
	 */
	@RequestMapping("/del")
	public Msg del(@RequestParam Map<String, Object> param){
		String ids = WebUtil.getParam(param, "ids");
		System.out.println("ids = " + ids);

		return Msg.success().add("ret","ok");
	}
	
	

	/**
	 * 带条件分页
	 * @param param
	 * @return
	 */
	@RequestMapping("/list")
	public Msg list(@RequestParam Map<String, Object> param){
		List<ShopAdminEntity> list = shopAdminService.list(param);
		PageInfo<ShopAdminEntity> pageInfo = new PageInfo<>(list,5);
		return Msg.success().add("pageInfo",pageInfo);
	}


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

		ShopAdmin bean = new ShopAdmin();
		bean.setAacount(aacount);
		bean.setApass(apass);
		ShopAdminEntity admin = shopAdminService.login(bean);

		if(admin==null){
			return Msg.fail().add("msg","账号密码错误！");
		}

		session.setAttribute(AdminConstants.LOGIN_ADMIN,admin);

		return Msg.success().add(AdminConstants.LOGIN_ADMIN,admin);
	}

}
