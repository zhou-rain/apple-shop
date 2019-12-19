package com.qmall.apple.sale.timer;

import com.qmall.apple.sale.service.OrderService;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: zhouR
 * @date: Create in 2019/12/19 - 15:09
 * @function: 订单计时器
 */
public class OrderTimer extends TimerTask {

	//计时器
	private Timer timer;

	//要取消的目标订单
	private String orderId;

	public OrderTimer(){}

	public OrderTimer(Timer timer, String orderId) {
		this.timer = timer;
		this.orderId = orderId;
	}

	//如果订单支付超时，就将订单设置为超时失效
	//如果订单成功以后，要将定时器关闭
	//这里用一个map集合存储定时器
	@Override
	public void run() {
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		OrderService orderService = wac.getBean(OrderService.class);

		String result = orderService.payTimeOut(orderId);
		if("ok".equals(result)){
			timer.cancel();
		}
	}

}
