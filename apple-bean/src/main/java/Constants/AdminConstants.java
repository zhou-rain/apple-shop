package Constants;

/**
 * @author: zhouR
 * @date: Create in 2019/12/11 - 19:13
 * @function:
 */
public class AdminConstants {
	//用户登录标志
	public static final String LOGIN_ADMIN = "loginAdmin";
	//token
	public static final String TOKEN = "token";
	//权限标志
	public static final String AUTH_PATH = "authPath";


	//用户状态  -1:不存在  0:禁用  1:启用
	public static final short STATUE_ADMIN_NOTEXIST = -1;
	public static final short STATUE_ADMIN_INUSE = 1;
	public static final short STATUE_ADMIN_FORBIDDEN = 0;


}
