package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopGoods;
import com.qmall.apple.bean.ShopGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsMapper {
    long countByExample(ShopGoodsExample example);

    int deleteByExample(ShopGoodsExample example);

    int deleteByPrimaryKey(String gid);

    int insert(ShopGoods record);

    int insertSelective(ShopGoods record);

    List<ShopGoods> selectByExample(ShopGoodsExample example);

    ShopGoods selectByPrimaryKey(String gid);

    int updateByExampleSelective(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByExample(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByPrimaryKeySelective(ShopGoods record);

    int updateByPrimaryKey(ShopGoods record);

	ShopGoods selectByPrimaryKey_WithType(String gid);
}