package com.qmall.apple.sale.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 10:46
 * @function:
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String test(HttpServletRequest request){


		return "ok";
	}
}
