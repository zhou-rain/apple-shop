import com.qmall.apple.commons.WebUtil;
import org.junit.Test;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 10:25
 * @function:
 */
public class test {
	/**
	 * function:
	 */
	@Test
	public void test(){


		String token = WebUtil.getToken("127.0.0.1", 5);
		System.out.println("token = " + token);

	}
}