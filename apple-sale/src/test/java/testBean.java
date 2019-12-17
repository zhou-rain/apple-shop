import com.qmall.apple.Entity.ShopGoodsTypeEntity;
import com.qmall.apple.bean.ShopGoodsType;
import com.qmall.apple.sale.util.TransformBean;
import org.junit.Test;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 14:36
 * @function:
 */
public class testBean implements TransformBean<ShopGoodsType,ShopGoodsTypeEntity> {


	/**
	 * function:
	 */
	@Test
	public void test(){
		ShopGoodsType bean = new ShopGoodsType();
		bean.setTdesc("213");
		bean.setTname("哈哈哈");
		System.out.println("bean = " + bean);


		ShopGoodsTypeEntity after = ChangeBean(bean, new ShopGoodsTypeEntity());

		System.out.println("after = " + after);


	}




}
