package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Department;

public interface DepartmentDao {
    int deleteByPrimaryKey(Byte id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}