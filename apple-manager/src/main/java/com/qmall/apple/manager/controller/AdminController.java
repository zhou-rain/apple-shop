package com.qmall.apple.manager.controller;


import Constants.AdminConstants;
import com.github.pagehelper.PageInfo;
import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.Entity.ShopAuthEntity;
import com.qmall.apple.Entity.ShopRoleEntity;
import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;
import com.qmall.apple.manager.service.ShopAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/*
/del 	删除管理员
/list   带分页查询
/status	状态管理
/del	删除
 */


/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 11:59
 * @function:
 */
@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = {"http://localhost:63343", "null"})
public class AdminController {

	@Autowired
	ShopAdminService shopAdminService;


	/**
	 * 状态启用和停用
	 * 1-启用
	 * 0-停用
	 * @param param
	 * @return
	 */
	@RequestMapping("/status")
	public Msg status(@RequestParam Map<String, Object> param){
		String status = WebUtil.getParam(param, "status");
		int userId = WebUtil.getIntParam(param, "userId");

		String ret = shopAdminService.changeStatus(userId,status);

		return Msg.success().add("ret",ret);
	}

	/**
	 * 删除
	 * @param param
	 * @return
	 */
	@RequestMapping("/del")
	public Msg del(@RequestParam Map<String, Object> param){
		String ids = WebUtil.getParam(param, "ids");
		System.out.println("ids = " + ids);
		String ret = shopAdminService.deleteBatchById(ids);

		return Msg.success().add("ret",ret);
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
	public Msg login(@RequestParam Map<String, Object> param, HttpSession session, HttpServletRequest request){
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

		session.setAttribute(AdminConstants.LOGIN_ADMIN,admin);//登录对象

		//获取权限地址的字符串
		List<String> authPathStrs = getAuthPathStr(admin);
		StringBuffer sb = new StringBuffer();
		for (String s : authPathStrs) {
			sb.append(s);
		}
		session.setAttribute(AdminConstants.AUTH_PATH,sb.toString());//权限

		String ipAddr = WebUtil.getIpAddr(request);
		String token = WebUtil.getToken(ipAddr, admin.getAid());


		//将用户角色和密码设空传到前端
		admin.setRoles(null);
		admin.setApass(null);
		return Msg.success()
				.add(AdminConstants.LOGIN_ADMIN,admin)
				.add("token",token);
	}


	/**
	 * 获取用户权限地址
	 * @param admin
	 * @return
	 */
	private List<String> getAuthPathStr(ShopAdminEntity admin){
		List<String> list = new ArrayList<>();
		for (ShopRoleEntity roles : admin.getRoles()) {
			for (ShopAuthEntity auth : roles.getAuths()) {
				list.add(auth.getAupath());
			}
		}
		return list;
	}










}
