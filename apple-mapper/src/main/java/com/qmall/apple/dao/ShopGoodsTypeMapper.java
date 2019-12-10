package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopGoodsType;
import com.qmall.apple.bean.ShopGoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsTypeMapper {
    long countByExample(ShopGoodsTypeExample example);

    int deleteByExample(ShopGoodsTypeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(ShopGoodsType record);

    int insertSelective(ShopGoodsType record);

    List<ShopGoodsType> selectByExample(ShopGoodsTypeExample example);

    ShopGoodsType selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") ShopGoodsType record, @Param("example") ShopGoodsTypeExample example);

    int updateByExample(@Param("record") ShopGoodsType record, @Param("example") ShopGoodsTypeExample example);

    int updateByPrimaryKeySelective(ShopGoodsType record);

    int updateByPrimaryKey(ShopGoodsType record);
}