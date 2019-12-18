package Constants;

/**
 * @author: zhouR
 * @date: Create in 2019/12/17 - 14:21
 * @function:
 */
public class SaleConstants {
	//商品删除标志  0:可用 1:删除
	public static final int GOODS_DELETE = 1;
	public static final int GOODS_INUSE = 0;

	//购物车状态  1展示 2选中支付 3支付成功
	public static final int CART_SHOW = 1;
	public static final int CART_CHECKED = 2;
	public static final int CART_SUCCESS = 3;

	//支付状态 1:未支付;2:已支付3:已发货;4:超时失效
	public static final int ORDER_STATUS_NOTPAY = 1;
	public static final int ORDER_STATUS_PAY = 2;
	public static final int ORDER_STATUS_SEND = 3;
	public static final int ORDER_STATUS_TIMEOUT = 4;




}
