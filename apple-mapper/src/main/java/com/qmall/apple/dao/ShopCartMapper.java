package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopCart;
import com.qmall.apple.bean.ShopCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCartMapper {
    long countByExample(ShopCartExample example);

    int deleteByExample(ShopCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopCart record);

    int insertSelective(ShopCart record);

    List<ShopCart> selectByExample(ShopCartExample example);

    ShopCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopCart record, @Param("example") ShopCartExample example);

    int updateByExample(@Param("record") ShopCart record, @Param("example") ShopCartExample example);

    int updateByPrimaryKeySelective(ShopCart record);

    int updateByPrimaryKey(ShopCart record);

    //根据用户id查看所有订单
	List<ShopCart> selectCart_ByCustomerId_WithGoods(int cid);

	//根据主键查询一条记录
	ShopCart selectCart_ByPrimaryKey_WithGoods(int id);

	ShopCart selectByGidAndCid(@Param("gid")String gid, @Param("cid")int cid);
}