package com.qmall.apple.shiro.service.impl;

import com.qmall.apple.dao.ShopShiroMapper;
import com.qmall.apple.shiro.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhouR
 * @date: Create in 2019/12/30 - 15:14
 * @function:
 */
@Service
public class ShiroServiceImpl implements ShiroService {

	@Autowired
	ShopShiroMapper shopShiroMapper;



}
