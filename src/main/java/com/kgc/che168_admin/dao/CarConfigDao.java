package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.CarConfig;

public interface CarConfigDao {
    int deleteByPrimaryKey(Long id);

    int insert(CarConfig record);

    int insertSelective(CarConfig record);

    CarConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarConfig record);

    int updateByPrimaryKey(CarConfig record);
}