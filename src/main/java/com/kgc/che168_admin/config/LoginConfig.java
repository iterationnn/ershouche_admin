package com.kgc.che168_admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kgc.che168_admin.interceptor.LoginInterceptor;

@Configuration
public class LoginConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册拦截器
		LoginInterceptor loginInterceptor = new LoginInterceptor();
		InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);
		//拦截路径
		loginRegistry.addPathPatterns("/**");
		//排除路径
		//loginRegistry.excludePathPatterns("/");
        //loginRegistry.excludePathPatterns("/login");
        //loginRegistry.excludePathPatterns("/loginout");
		loginRegistry.excludePathPatterns("/login.html","/pLogin");
		//排除资源请求
        //loginRegistry.excludePathPatterns("/css/login/*.css");
        //loginRegistry.excludePathPatterns("/js/login/**/*.js");
        //loginRegistry.excludePathPatterns("/image/login/*.png");
		loginRegistry.excludePathPatterns("/css/**");
		loginRegistry.excludePathPatterns("/js/**");
		loginRegistry.excludePathPatterns("/images/**");
		//loginRegistry.excludePathPatterns("/lib/*");//这样写这个资源被拦截了 <script src="./lib/layui/layui.js" charset="utf-8">
		loginRegistry.excludePathPatterns("/lib/**");//这样写才能底层多个目录
	}
	
}
