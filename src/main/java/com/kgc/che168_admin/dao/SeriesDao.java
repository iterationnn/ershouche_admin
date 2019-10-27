package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Series;

public interface SeriesDao {
    int deleteByPrimaryKey(Long id);

    int insert(Series record);

    int insertSelective(Series record);

    Series selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Series record);

    int updateByPrimaryKey(Series record);
}