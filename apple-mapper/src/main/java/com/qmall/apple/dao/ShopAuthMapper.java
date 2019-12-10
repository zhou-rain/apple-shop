package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopAuth;
import com.qmall.apple.bean.ShopAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopAuthMapper {
    long countByExample(ShopAuthExample example);

    int deleteByExample(ShopAuthExample example);

    int deleteByPrimaryKey(Integer auid);

    int insert(ShopAuth record);

    int insertSelective(ShopAuth record);

    List<ShopAuth> selectByExample(ShopAuthExample example);

    ShopAuth selectByPrimaryKey(Integer auid);

    int updateByExampleSelective(@Param("record") ShopAuth record, @Param("example") ShopAuthExample example);

    int updateByExample(@Param("record") ShopAuth record, @Param("example") ShopAuthExample example);

    int updateByPrimaryKeySelective(ShopAuth record);

    int updateByPrimaryKey(ShopAuth record);
}