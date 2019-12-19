package com.qmall.apple.sale.listener;

import com.qmall.apple.commons.God;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/**
 * 项目启动的时候，将一些常用的数据放在application中，整个项目共享
 * @author Zhour
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
		System.out.println("初始化项目路径>>> basepath:"+context.getContextPath());

		//初始化timer计时器
		Map<String,Timer> timerMap = new HashMap<>();
		context.setAttribute("timerMap", timerMap);
		System.out.println("初始化timer计时器>>> timerMap ");
		
		//设置完要去web.xml中配置
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
