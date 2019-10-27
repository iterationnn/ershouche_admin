package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.CarDetail;

public interface CarDetailDao {
    int deleteByPrimaryKey(Long id);

    int insert(CarDetail record);

    int insertSelective(CarDetail record);

    CarDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarDetail record);

    int updateByPrimaryKey(CarDetail record);
}