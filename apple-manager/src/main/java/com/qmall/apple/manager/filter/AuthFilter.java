package com.qmall.apple.manager.filter;

import Constants.AdminConstants;
import com.qmall.apple.commons.Validator;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: zhouR
 * @date: Create in 2019/12/14 - 14:36
 * @function:
 */
public class AuthFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	String staticPath = ".jsp.js.css.font.html.jpg.jpeg.png.ttf.woff";
	String passPass = "/admin/login";

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("******************Auth校验***************************");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String path = request.getServletPath(); //用户请求地址

		//静态资源文件放行
		if(path.contains(".")){
			String suffix = path.substring(path.lastIndexOf("."));//请求地址的后缀
			if(staticPath.contains(suffix)){
				System.out.println("静态资源文件放行");
				//如果请求地址后缀是静态资源文件，直接放行
				filterChain.doFilter(request,response);
				return;
			}
		}

		//登录注册放行
		if(passPass.contains(path)){
			//如果请求地址后缀是静态资源文件，直接放行
			System.out.println("登录注册放行");
			filterChain.doFilter(request,response);
			return;
		}


		//从session域中获取当前用户的权限地址
		String authPath = request.getSession().getAttribute(AdminConstants.AUTH_PATH).toString();
		System.out.println("当前用户权限地址authPath = " + authPath);
		if(Validator.isNull(authPath)){
			System.out.println("没登录");
			//用户没登录
			//给前端设置状态码999，标记未登录
			response.setStatus(999);
			//给出跳转链接
			System.out.println("-------------------没权限------------------------");

			return;
		}

		//判断当前用户是否有权限执行这个请求地址
		if (authPath.contains(path)) {
			System.out.println("有权限操作");

			filterChain.doFilter(request,response);
			return;
		}else {
			System.out.println("-------------------没权限------------------------");
			return;
		}

	}


	@Override
	public void destroy() {

	}
}
