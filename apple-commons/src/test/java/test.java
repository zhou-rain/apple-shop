import com.qmall.apple.utils.DateTimeUtil;
import com.qmall.apple.utils.WebUtil;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

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

	/**
	 * function:
	 */
	@Test
	public void test5(){
		int periodDays = DateTimeUtil.periodDays(DateTimeUtil.DateToLocalDate(new Date()), LocalDate.now().plusDays(60));
		System.out.println("periodDays = " + periodDays);
	}

	/**
	 * function:
	 */
	@Test
	public void tes1t(){
		System.out.println(UUID.randomUUID().toString().length());
	}




}
