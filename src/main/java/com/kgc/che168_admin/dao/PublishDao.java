package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Publish;

public interface PublishDao {
    int deleteByPrimaryKey(Long id);

    int insert(Publish record);

    int insertSelective(Publish record);

    Publish selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Publish record);

    int updateByPrimaryKey(Publish record);
}