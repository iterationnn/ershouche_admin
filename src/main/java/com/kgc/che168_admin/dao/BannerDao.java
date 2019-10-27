package com.kgc.che168_admin.dao;

import java.util.List;

import com.kgc.che168_admin.pojo.Banner;

public interface BannerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);
  //根据id修改其他字段
    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
  //分界线
    //获取轮播列表
    List<Banner> getBannerList();
}