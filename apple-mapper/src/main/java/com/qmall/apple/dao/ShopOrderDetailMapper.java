package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopOrderDetail;
import com.qmall.apple.bean.ShopOrderDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopOrderDetailMapper {
    long countByExample(ShopOrderDetailExample example);

    int deleteByExample(ShopOrderDetailExample example);

    int deleteByPrimaryKey(String odid);

    int insert(ShopOrderDetail record);

    int insertSelective(ShopOrderDetail record);

    List<ShopOrderDetail> selectByExample(ShopOrderDetailExample example);

    ShopOrderDetail selectByPrimaryKey(String odid);

    int updateByExampleSelective(@Param("record") ShopOrderDetail record, @Param("example") ShopOrderDetailExample example);

    int updateByExample(@Param("record") ShopOrderDetail record, @Param("example") ShopOrderDetailExample example);

    int updateByPrimaryKeySelective(ShopOrderDetail record);

    int updateByPrimaryKey(ShopOrderDetail record);
}