package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Post;

public interface PostDao {
    int deleteByPrimaryKey(Byte id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}