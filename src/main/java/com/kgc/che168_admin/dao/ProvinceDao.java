package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Province;

public interface ProvinceDao {
    int deleteByPrimaryKey(Integer proID);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer proID);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}