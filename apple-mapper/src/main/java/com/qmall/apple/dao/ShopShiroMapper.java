package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopShiro;
import com.qmall.apple.bean.ShopShiroExample;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ShopShiroMapper {
    long countByExample(ShopShiroExample example);

    int deleteByExample(ShopShiroExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(ShopShiro record);

    int insertSelective(ShopShiro record);

    List<ShopShiro> selectByExample(ShopShiroExample example);

    ShopShiro selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") ShopShiro record, @Param("example") ShopShiroExample example);

    int updateByExample(@Param("record") ShopShiro record, @Param("example") ShopShiroExample example);

    int updateByPrimaryKeySelective(ShopShiro record);

    int updateByPrimaryKey(ShopShiro record);

	//根据用户id获取当前用户所有的权限
	//List<ShopShiro> selectListByAdminId(int adminId);

	/**
	 * 获取所有的权限
	 * @return
	 */
	List<ShopShiro> getAll();
}