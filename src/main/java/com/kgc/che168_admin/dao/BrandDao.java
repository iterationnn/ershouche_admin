package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Brand;

public interface BrandDao {
    int deleteByPrimaryKey(Long id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}