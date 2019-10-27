package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Color;

public interface ColorDao {
    int deleteByPrimaryKey(Long id);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}