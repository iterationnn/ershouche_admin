package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.City;

public interface CityDao {
    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}