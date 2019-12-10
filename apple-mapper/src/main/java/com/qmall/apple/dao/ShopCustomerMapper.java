package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopCustomer;
import com.qmall.apple.bean.ShopCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCustomerMapper {
    long countByExample(ShopCustomerExample example);

    int deleteByExample(ShopCustomerExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(ShopCustomer record);

    int insertSelective(ShopCustomer record);

    List<ShopCustomer> selectByExample(ShopCustomerExample example);

    ShopCustomer selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") ShopCustomer record, @Param("example") ShopCustomerExample example);

    int updateByExample(@Param("record") ShopCustomer record, @Param("example") ShopCustomerExample example);

    int updateByPrimaryKeySelective(ShopCustomer record);

    int updateByPrimaryKey(ShopCustomer record);
}