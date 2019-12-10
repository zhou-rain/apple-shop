package com.qmall.apple.sale.controller;

import com.qmall.apple.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhouR
 * @date: Create in 2019/12/10 - 12:47
 * @function:
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		User user = new User();
		return "success!";
	}
}
