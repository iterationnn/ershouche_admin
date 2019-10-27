package com.kgc.che168_admin.service;



import java.util.List;

import com.github.pagehelper.PageInfo;
import com.kgc.che168_admin.pojo.User;

public interface SaleService {

	PageInfo<User> getUserList(Integer pageNum);
	
	int insertUser(User user);
	
}
