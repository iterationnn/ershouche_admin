package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Structure;

public interface StructureDao {
    int deleteByPrimaryKey(Long id);

    int insert(Structure record);

    int insertSelective(Structure record);

    Structure selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Structure record);

    int updateByPrimaryKey(Structure record);
}