package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Discharged;

public interface DischargedDao {
    int deleteByPrimaryKey(Long id);

    int insert(Discharged record);

    int insertSelective(Discharged record);

    Discharged selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Discharged record);

    int updateByPrimaryKey(Discharged record);
}