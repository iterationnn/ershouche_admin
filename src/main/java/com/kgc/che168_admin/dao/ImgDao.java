package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Img;

public interface ImgDao {
    int deleteByPrimaryKey(Long id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}