package com.qmall.apple.manager.controller;

import com.qmall.apple.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 11:59
 * @function:
 */
@Controller
@RequestMapping("/manager")
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		User user = new User();
		return "success!";
	}

}
