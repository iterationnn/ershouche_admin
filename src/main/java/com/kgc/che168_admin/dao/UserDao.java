package com.kgc.che168_admin.dao;

import java.util.List;

import com.kgc.che168_admin.pojo.User;

public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
  //密码登录(手机号/邮箱/用户名登录)
    User pLogin(User user);
    
    List<User> getUserList();
}