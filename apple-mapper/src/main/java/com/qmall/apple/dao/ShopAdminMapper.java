package com.qmall.apple.dao;

import com.qmall.apple.Entity.ShopAdminEntity;
import com.qmall.apple.bean.ShopAdmin;
import com.qmall.apple.bean.ShopAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopAdminMapper {
    long countByExample(ShopAdminExample example);

    int deleteByExample(ShopAdminExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(ShopAdmin record);

    int insertSelective(ShopAdmin record);

    List<ShopAdminEntity> selectByExample(ShopAdminExample example);

	ShopAdminEntity selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") ShopAdmin record, @Param("example") ShopAdminExample example);

    int updateByExample(@Param("record") ShopAdmin record, @Param("example") ShopAdminExample example);

    int updateByPrimaryKeySelective(ShopAdmin record);

    int updateByPrimaryKey(ShopAdmin record);
}