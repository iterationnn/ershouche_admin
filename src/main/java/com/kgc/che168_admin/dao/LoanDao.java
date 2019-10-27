package com.kgc.che168_admin.dao;

import com.kgc.che168_admin.pojo.Loan;

public interface LoanDao {
    int deleteByPrimaryKey(Long id);

    int insert(Loan record);

    int insertSelective(Loan record);

    Loan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}