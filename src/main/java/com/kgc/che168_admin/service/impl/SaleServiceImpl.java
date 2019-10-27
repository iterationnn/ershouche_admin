package com.kgc.che168_admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.che168_admin.dao.UserDao;
import com.kgc.che168_admin.pojo.User;
import com.kgc.che168_admin.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private UserDao userdao;
	

	@Override
	public 	PageInfo<User> getUserList(Integer pageNum) {
		if(pageNum==null) {
			pageNum=1;
		}
		PageHelper.startPage(pageNum, 5);
		List<User> userList = userdao.getUserList();
		
		PageInfo<User> pageInfo=new PageInfo<User>(userList,5);
		return pageInfo;
		/*return userList;*/
	}


	@Override
	public int insertUser(User user) {
		
		return userdao.insertSelective(user);
	}
	

}
