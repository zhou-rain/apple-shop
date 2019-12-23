package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopOrder;
import com.qmall.apple.bean.ShopOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopOrderMapper {
    long countByExample(ShopOrderExample example);

    int deleteByExample(ShopOrderExample example);

    int deleteByPrimaryKey(String oid);

    int insert(ShopOrder record);

    int insertSelective(ShopOrder record);

    List<ShopOrder> selectByExample(ShopOrderExample example);

    ShopOrder selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByExample(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByPrimaryKeySelective(ShopOrder record);

    int updateByPrimaryKey(ShopOrder record);




	ShopOrder selectByPrimaryKey_With_Detail(String oid);
}