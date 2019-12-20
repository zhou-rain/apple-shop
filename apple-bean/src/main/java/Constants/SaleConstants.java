package Constants;

/**
 * @author: zhouR
 * @date: Create in 2019/12/17 - 14:21
 * @function:
 */
public class SaleConstants {


	public static final String BASE_PATH = "basepath";		//项目地址

	public static final String TIMER_MAP = "timerMap";		//订单定时器

	public static final Long ORDER_OUT_TIME = 1000*60L;	//订单失效时间1分钟  单位：毫秒


	//商品删除标志  0:可用 1:删除
	public static final int GOODS_DELETE = 1;
	public static final int GOODS_INUSE = 0;

	//购物车状态  1展示 2选中支付 3支付成功
	public static final int CART_SHOW = 1;
	public static final int CART_CHECKED = 2;
	public static final int CART_SUCCESS = 3;

	//支付状态
	public static final int ORDER_STATUS_NOTPAY = 1;	//1:未支付
	public static final int ORDER_STATUS_PAY = 2;		//2:已支付
	public static final int ORDER_STATUS_SEND = 3;		//3:已发货
	public static final int ORDER_STATUS_TIMEOUT = 4;	//4:超时失效








}
