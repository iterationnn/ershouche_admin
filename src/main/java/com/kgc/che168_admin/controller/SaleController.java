package com.kgc.che168_admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kgc.che168_admin.pojo.User;
import com.kgc.che168_admin.service.AdminService;
import com.kgc.che168_admin.service.SaleService;
import com.kgc.che168_admin.util.Result;
import com.kgc.che168_admin.util.ResultEnum;
import com.kgc.che168_admin.util.ResultUtil;

@RestController
public class SaleController {
	@Autowired
	SaleService sale;
	
	//获取用户列表
	@RequestMapping("/getUserList")
    public Result getUserList(String pageNum){
    	return ResultUtil.success(sale.getUserList(Integer.valueOf(pageNum)));
    };
    
  //增加用户
    @RequestMapping("/insertUser")
    public Result insertUser( String email,  String userName,  String realName,
    		 String sex,  String phone,  String identityId,
    		 String password){
    	System.out.println(email+userName+realName+sex+phone+identityId+password);
    	User user = new User();
    	user.setEmail(email);
    	user.setUserName(userName);
    	user.setRealName(realName);
    	System.out.println(sex);
    	user.setSex(Byte.parseByte(sex));
    	user.setPhone(phone);
    	user.setIdentityId(identityId);
    	user.setPassword(password);
    	user.setRoleId(Byte.parseByte("0"));
    	int count = sale.insertUser(user);
    	if(count>0) {
    		return ResultUtil.success();
    	}else {
    		return ResultUtil.error(ResultEnum.SAVE_ERRO.getCode(), ResultEnum.SAVE_ERRO.getMsg());
    	}
    	
    };
}
