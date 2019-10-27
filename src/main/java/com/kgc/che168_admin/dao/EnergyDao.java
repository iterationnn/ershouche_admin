package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Energy;

public interface EnergyDao {
    int deleteByPrimaryKey(Long id);

    int insert(Energy record);

    int insertSelective(Energy record);

    Energy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Energy record);

    int updateByPrimaryKey(Energy record);
}