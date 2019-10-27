package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.SaleOnLine;

public interface SaleOnLineDao {
    int deleteByPrimaryKey(Long id);

    int insert(SaleOnLine record);

    int insertSelective(SaleOnLine record);

    SaleOnLine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SaleOnLine record);

    int updateByPrimaryKey(SaleOnLine record);
}