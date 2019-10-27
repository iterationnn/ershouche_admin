package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Config;

public interface ConfigDao {
    int deleteByPrimaryKey(Long id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}