package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Level;

public interface LevelDao {
    int deleteByPrimaryKey(Long id);

    int insert(Level record);

    int insertSelective(Level record);

    Level selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);
}