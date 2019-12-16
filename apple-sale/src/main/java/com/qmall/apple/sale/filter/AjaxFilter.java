package com.qmall.apple.sale.filter;

import Constants.AdminConstants;
import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.commons.Validator;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 12:51
 * @function: 处理ajax令牌时效性
 */
public class AjaxFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		System.out.println("\n******************ajax校验***************************");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String path = request.getServletPath(); //用户请求地址
		System.out.println("请求地址path = " + path);
		HttpSession session = request.getSession();
		ShopAdminEntity entity = (ShopAdminEntity) session.getAttribute(AdminConstants.LOGIN_ADMIN);

		if (!isAjaxRequest(request)) {
			//如果不是ajax请求
			System.out.println("非ajax请求");
			filterChain.doFilter(request, response);
			return;
		} else {
			System.out.println("ajax请求");
			//如果是登录和首页，直接放行
			if (path.contains("/login")) {
				System.out.println("登录请求，直接放行");
				filterChain.doFilter(request, response);
				return;
			}
			else {
				System.out.println("验证令牌");
				//用户请求必传
				String token = request.getParameter("token");
				String userId= request.getParameter("userId");

				if (Validator.isNull(token)||Validator.isNull(userId)) {
					response.setStatus(999);			//给前端设置状态码999，标记未登录
					response.getWriter().write("login.html");//给出跳转链接
					return;
				}

				if (token.equals(entity.getToken())) {
					System.out.println("令牌验证成功");
					filterChain.doFilter(request, response);
					return;
				}
			}
		}
	}

	/***
	 * 判断一个请求是否为AJAX请求,是则返回true
	 * @param request
	 * @return
	 */
	public static boolean isAjaxRequest(HttpServletRequest request) {
		String requestType = request.getHeader("X-Requested-With");
		//如果requestType能拿到值，并且值为 XMLHttpRequest ,表示客户端的请求为异步请求，那自然是ajax请求了，
		// 反之如果为null,则是普通的请求
		if (requestType == null) {
			return false;
		}
		return true;
	}

	@Override
	public void destroy() {

	}
}
