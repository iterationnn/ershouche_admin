package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Recommend;

public interface RecommendDao {
    int deleteByPrimaryKey(Long id);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    Recommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Recommend record);

    int updateByPrimaryKey(Recommend record);
}