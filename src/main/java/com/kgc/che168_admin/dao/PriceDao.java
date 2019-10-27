package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Price;

public interface PriceDao {
    int deleteByPrimaryKey(Long id);

    int insert(Price record);

    int insertSelective(Price record);

    Price selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}