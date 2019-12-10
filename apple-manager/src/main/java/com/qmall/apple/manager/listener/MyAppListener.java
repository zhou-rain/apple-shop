package com.qmall.apple.manager.listener;

import com.qmall.apple.commons.God;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 项目启动的时候，将一些常用的数据放在application中，大家都能用
 * @author Administrator
 *
 */
public class MyAppListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//佛祖开光
		God.bless();
		
		ServletContext context = sce.getServletContext();
		
		//将项目路径放在application域中
		context.setAttribute("basepath", context.getContextPath());
		System.out.println("basepath:"+context.getContextPath());
		
		//设置完要去web.xml中配置
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
