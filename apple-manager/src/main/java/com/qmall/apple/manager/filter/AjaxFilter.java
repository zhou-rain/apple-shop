package com.qmall.apple.manager.filter;

import com.qmall.apple.commons.Validator;
import com.qmall.apple.commons.WebUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 12:51
 * @function: 处理ajax令牌时效性
 */
public class AjaxFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;


		if (!isAjaxRequest(request)) {
			//如果不是ajax请求
			filterChain.doFilter(request, response);
			return;
		} else {
			System.out.println("ajax请求");
			/*//如果是登录和首页，直接放行
			String path = request.getServletPath();
			if (path.contains("/admin/login")) {
				filterChain.doFilter(request, response);
				return;
			} else {
				//用户请求必传
				String userId = servletRequest.getAttribute("userId").toString();
				String token = servletRequest.getAttribute("token").toString();
				//获取用户请求地址
				String ipAddr = WebUtil.getIpAddr(request);

				if (Validator.isNull(userId) || Validator.isNull(token)) {
					String contextPath = request.getContextPath();
					response.getWriter().write("<script>" +
							"alert('数据有误!请重新登录');" +
							"window.location.href='" + contextPath + "/manager/login.html'" +
							"</script>");
					return;
				}


				if (WebUtil.checkToken(token, ipAddr, Integer.parseInt(userId))) {
					filterChain.doFilter(request, response);
					return;
				} else {

					String contextPath = request.getContextPath();
					response.getWriter().write("<script>" +
							"alert('数据有误!请重新登录');" +
							"window.location.href='" + contextPath + "/manager/login.html'" +
							"</script>");
				}
			}*/
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
