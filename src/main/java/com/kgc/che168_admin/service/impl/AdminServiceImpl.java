package com.kgc.che168_admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgc.che168_admin.dao.BannerDao;
import com.kgc.che168_admin.dao.UserDao;
import com.kgc.che168_admin.pojo.Banner;
import com.kgc.che168_admin.pojo.User;
import com.kgc.che168_admin.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	BannerDao bannerDao;
	@Autowired
	UserDao userDao;
	
	//获取轮播列表
	@Override
	public List<Banner> getBannerList() {
		return bannerDao.getBannerList();
	}
	//根据id修改其他字段
	@Override
	public int updateByPrimaryKeySelective(Banner record) {
		return bannerDao.updateByPrimaryKeySelective(record);
	}
	//密码登录
	@Override
	public User pLogin(User user) {
		return userDao.pLogin(user);
	}

}
