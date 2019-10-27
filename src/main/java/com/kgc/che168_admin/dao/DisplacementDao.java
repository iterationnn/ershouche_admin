package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Displacement;

public interface DisplacementDao {
    int deleteByPrimaryKey(Long id);

    int insert(Displacement record);

    int insertSelective(Displacement record);

    Displacement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Displacement record);

    int updateByPrimaryKey(Displacement record);
}