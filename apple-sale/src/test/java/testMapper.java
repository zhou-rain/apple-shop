import com.qmall.apple.bean.ShopGoods;
import com.qmall.apple.dao.ShopAdminMapper;
import com.qmall.apple.sale.service.GoodsService;
import com.qmall.apple.sale.service.impl.GoodsServiceImpl;
import org.junit.Test;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author: zhouR
 * @date: Create in 2019/12/20 - 20:20
 * @function:
 */
public class testMapper {

	


	/**
	 * function:
	 */
	@Test
	public void test1(){

		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		GoodsService goodsService = context.getBean(GoodsService.class);

		ShopGoods entityById = goodsService.getEntityById("12");
		System.out.println("entityById = " + entityById);

	}




}
