package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopRoleAuth;
import com.qmall.apple.bean.ShopRoleAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopRoleAuthMapper {
    long countByExample(ShopRoleAuthExample example);

    int deleteByExample(ShopRoleAuthExample example);

    int deleteByPrimaryKey(Integer rAuId);

    int insert(ShopRoleAuth record);

    int insertSelective(ShopRoleAuth record);

    List<ShopRoleAuth> selectByExample(ShopRoleAuthExample example);

    ShopRoleAuth selectByPrimaryKey(Integer rAuId);

    int updateByExampleSelective(@Param("record") ShopRoleAuth record, @Param("example") ShopRoleAuthExample example);

    int updateByExample(@Param("record") ShopRoleAuth record, @Param("example") ShopRoleAuthExample example);

    int updateByPrimaryKeySelective(ShopRoleAuth record);

    int updateByPrimaryKey(ShopRoleAuth record);
}