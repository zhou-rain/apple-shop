package com.qmall.apple.manager.controller;

import com.github.pagehelper.PageInfo;
import com.qmall.apple.Entity.ShopRoleEntity;
import com.qmall.apple.commons.Msg;
import com.qmall.apple.manager.service.ShopRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 17:09
 * @function: 角色
 */
@RestController
@RequestMapping("/role")
@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
public class RoleController {

	@Autowired
	ShopRoleService shopRoleService;

	/**
	 * 删除
	 * @param request
	 * @return
	 */
	@RequestMapping("/del")
	public Msg del(HttpServletRequest request){
		String ids = request.getParameter("ids");
		String ret = shopRoleService.delBatch(ids);
		return Msg.success().add("ret",ret);
	}


	/**
	 * 带条件查询
	 * @param param
	 * @return
	 */
	@RequestMapping("/list")
	public Msg list(@RequestParam Map<String, Object> param){
		List<ShopRoleEntity> list = shopRoleService.list(param);
		PageInfo<ShopRoleEntity> pageInfo = new PageInfo<>(list,5);
		return Msg.success().add("pageInfo",pageInfo);
	}


	/**
	 * 获取所有角色列表
	 * @return
	 */
	@RequestMapping("/getAll")
	public Msg getAll(){
		List<ShopRoleEntity> list = shopRoleService.getAllRoleList();
		return Msg.success().add("list",list);
	}


}
