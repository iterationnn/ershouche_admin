package com.kgc.che168_admin.service;

import java.util.List;

import com.kgc.che168_admin.pojo.Banner;
import com.kgc.che168_admin.pojo.User;

public interface AdminService {
	
	//获取轮播列表
    List<Banner> getBannerList();
    //根据id修改其他字段
    int updateByPrimaryKeySelective(Banner record);
    //密码登录
  	User pLogin(User user);
}
