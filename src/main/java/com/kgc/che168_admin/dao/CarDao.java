package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Car;

public interface CarDao {
    int deleteByPrimaryKey(Long id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}