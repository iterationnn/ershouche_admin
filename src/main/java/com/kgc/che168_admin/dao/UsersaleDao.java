package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Usersale;

public interface UsersaleDao {
    int deleteByPrimaryKey(Long id);

    int insert(Usersale record);

    int insertSelective(Usersale record);

    Usersale selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Usersale record);

    int updateByPrimaryKey(Usersale record);
}