package com.kgc.che168_admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgc.che168_admin.pojo.Banner;
import com.kgc.che168_admin.pojo.User;
import com.kgc.che168_admin.service.AdminService;
import com.kgc.che168_admin.util.Result;
import com.kgc.che168_admin.util.ResultEnum;
import com.kgc.che168_admin.util.ResultUtil;

@RestController
public class AdminContr {
	@Autowired
	AdminService adminService;
	
	//获取轮播列表
	@RequestMapping("/getBannerList")
    public Result getBannerList(){
    	return ResultUtil.success(adminService.getBannerList());
    };
    
    //根据id修改其他字段
    @RequestMapping("/updateByPrimaryKeySelective")
    public Result updateByPrimaryKeySelective(Banner banner) {
    	Result result=null;
    	result=ResultUtil.success(adminService.updateByPrimaryKeySelective(banner));
		return result;
	}
    
    //密码登录
    @RequestMapping("/pLogin")
	public Result pLogin(User user,HttpServletRequest request) {
		HttpSession session=request.getSession();
		Result result = null;
		//查询到的user
		User rUser;
		String userName=user.getUserName();
		String password=user.getUserName();
		//判断是邮箱还是手机号的正则表达式
		String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";/*注：js和java用正则表达式不一样*/
		/*String em ="/^\\w+@\\w+\\.[A-Za-z]{2,3}(\\.[A-Za-z]{2,3})?$/";*/     /*js用正则表达式*/ 
		String ph = "^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0,5-9]))\\d{8}$";  /*java用验证手机号*/
		//String us = "^esc[A-Za-z]{2}\\d{1}[A-Za-z]{1}\\d{1}[A-Za-z]{1}$"; //用户名正则表达式
		if (userName==null || password==null) {
			return ResultUtil.error(ResultEnum.LOGIN_ERRO.getCode(), ResultEnum.LOGIN_ERRO.getMsg());
		}else if (userName.matches(ph)) {
			user.setUserName(null);
			user.setPhone(userName);
			/*代码测试用*/
			System.out.println("手机号"+user.getPhone()+"请求登录");
		}else if(userName.matches(em)) {
			user.setUserName(null);
			user.setEmail(userName);
			System.out.println("邮箱"+user.getEmail()+"请求登录");
		} 
		rUser=adminService.pLogin(user);
		if (rUser==null) {
			result=ResultUtil.error(ResultEnum.LOGIN_ERRO.getCode(), ResultEnum.LOGIN_ERRO.getMsg());
		}else {
			result=ResultUtil.success(rUser);
			//将用户名加入session中
			session.setAttribute("userName",rUser.getUserName());
		}
		return result;
	}
    
  //退出登录
  	@RequestMapping("/loginOut")
  	public Result loginOut(HttpServletRequest request) {
  		Result result=null;
  		request.getSession().removeAttribute("userName");
  		result=ResultUtil.success();
  		return result;
  	}
}
