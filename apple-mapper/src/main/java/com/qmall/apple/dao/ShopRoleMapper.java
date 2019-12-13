package com.qmall.apple.dao;

import com.qmall.apple.Entity.ShopRoleEntity;
import com.qmall.apple.bean.ShopRole;
import com.qmall.apple.bean.ShopRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopRoleMapper {
    long countByExample(ShopRoleExample example);

    int deleteByExample(ShopRoleExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(ShopRole record);

    int insertSelective(ShopRole record);

    List<ShopRoleEntity> selectByExample(ShopRoleExample example);

	ShopRoleEntity selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") ShopRole record, @Param("example") ShopRoleExample example);

    int updateByExample(@Param("record") ShopRole record, @Param("example") ShopRoleExample example);

    int updateByPrimaryKeySelective(ShopRole record);

    int updateByPrimaryKey(ShopRole record);
}