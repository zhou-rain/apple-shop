package com.qmall.apple.dao;

import com.qmall.apple.bean.ShopAdminRole;
import com.qmall.apple.bean.ShopAdminRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopAdminRoleMapper {
    long countByExample(ShopAdminRoleExample example);

    int deleteByExample(ShopAdminRoleExample example);

    int deleteByPrimaryKey(Integer aRId);

    int insert(ShopAdminRole record);

    int insertSelective(ShopAdminRole record);

    List<ShopAdminRole> selectByExample(ShopAdminRoleExample example);

    ShopAdminRole selectByPrimaryKey(Integer aRId);

    int updateByExampleSelective(@Param("record") ShopAdminRole record, @Param("example") ShopAdminRoleExample example);

    int updateByExample(@Param("record") ShopAdminRole record, @Param("example") ShopAdminRoleExample example);

    int updateByPrimaryKeySelective(ShopAdminRole record);

    int updateByPrimaryKey(ShopAdminRole record);
}