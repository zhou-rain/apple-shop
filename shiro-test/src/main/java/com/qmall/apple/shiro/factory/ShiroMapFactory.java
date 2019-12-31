package com.qmall.apple.shiro.factory;

import com.qmall.apple.bean.ShopShiro;
import com.qmall.apple.dao.ShopShiroMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zhouR
 * @date: Create in 2019/12/30 - 20:10
 * @function:
 */
public class ShiroMapFactory {

	@Autowired
	ShopShiroMapper shopShiroMapper;


	public Map<String, String> build() {


		List<ShopShiro> all = shopShiroMapper.getAll();

		//保存进去是什么顺序，取出来还是什么顺序
		Map<String,String> map = new LinkedHashMap<>();

		for (ShopShiro shiro : all) {
			map.put(shiro.getSname(),shiro.getSfilter());
		}

		/*map1.put("/favicon.ico","anon");
		map1.put("/static/**","anon");
		map1.put("/images/**","anon");
		map1.put("/css/**","anon");
		map1.put("/js/**","anon");
		map1.put("/shiro/login","anon");
		map1.put("/shiro/logout","logout");
		map1.put("/admin.html","roles[admin]");
		map1.put("/user.html","roles[user,admin]");
		map.put("/**","authc");*/

		System.out.println("map = " + map);
		return map;
	}


}
