import com.qmall.apple.Entity.ShopGoodsTypeEntity;
import com.qmall.apple.bean.ShopGoodsType;
import com.qmall.apple.commons.DateTimeUtil;
import com.qmall.apple.commons.DateUtil;
import com.qmall.apple.sale.util.TransformBean;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 14:36
 * @function:
 */
public class testBean implements TransformBean<ShopGoodsType, ShopGoodsTypeEntity> {


	/**
	 * function:
	 */
	@Test
	public void test() {
		ShopGoodsType bean = new ShopGoodsType();
		bean.setTdesc("213");
		bean.setTname("哈哈哈");
		System.out.println("bean = " + bean);


		ShopGoodsTypeEntity after = ChangeBean(bean, new ShopGoodsTypeEntity());

		System.out.println("after = " + after);


	}

	/**
	 * function:
	 */
	@Test
	public void test12() throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");


		String startTime = "2019-12-19 12:49:00";


		Date d1 = df.parse("2019-12-19 14:46:00");

		long l = DateTimeUtil.betweenMillis(d1);
		System.out.println("l = " + l);
		

		/*Long betweenTime=0l;
		betweenTime =((now.getTime()-d1.getTime())/1000);
		System.out.println("betweenTime = " + betweenTime);*/

	/*	System.out.println((now.getTime() - d1.getTime()));

		System.out.println(now.getTime());
		System.out.println(d1.getTime());//1576728034000*/


	}




	/**
	 * function:Duration:计算两个时间之间的间隔
	 */
	@Test
	public void test7() throws InterruptedException, ParseException {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");

		Instant d1 = df.parse("2019-12-19 13:08:00").toInstant();


		Instant now = Instant.now();

		Duration between = Duration.between(d1, now);
		System.out.println("分钟 = " + between.toMinutes());  //between = 1000
		System.out.println("秒 = " + between.getSeconds());  //between = 1000
		System.out.println("毫秒 = " + between.toMillis());  //between = 1000


		//这里注意，获取时间有to 和 get 都要试一下，有点坑


	}

	/**
	 * function:
	 */
	@Test
	public void testt() throws ParseException, InterruptedException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");


		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parse = LocalDateTime.parse("2019-12-19 13:46:00", dtf);

		LocalDateTime now = LocalDateTime.now();
		System.out.println("now = " + now);

		Duration between = Duration.between(parse, now);
		System.out.println("分钟 = " + between.toMinutes());  //between = 1000
		System.out.println("秒 = " + between.getSeconds());  //between = 1000
		System.out.println("毫秒 = " + between.toMillis());  //between = 1000
	}
	
	/**
	 * function:
	 */
	@Test
	public void testnewdate(){
		LocalDateTime old = DateTimeUtil.parseLocalDateTime("2019-12-19 14:23:00");
		LocalDateTime now = LocalDateTime.now();
		Duration between = Duration.between(old, now);
		System.out.println("分钟 = " + between.toMinutes());  //between = 1000
		System.out.println("秒 = " + between.getSeconds());  //between = 1000
		System.out.println("毫秒 = " + between.toMillis());  //between = 1000
	}

}
