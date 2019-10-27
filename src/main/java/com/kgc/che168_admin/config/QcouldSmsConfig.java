package com.kgc.che168_admin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.qcloudsms.SmsMultiSender;
import com.github.qcloudsms.SmsSingleSender;

/**
 * @Configuration注解
 * 标记在类上,就像之前我们声明的一个spring的xml配置文件,该类我们称为配置类.
 * @ConfigurationProperties注解
 * 可以注入在application.yml配置文件中的属性,需注入的属性要添加set方法.
 */
@Configuration
@ConfigurationProperties(prefix="sms.tencent")
public class QcouldSmsConfig {

	private int appid;//应用id
	private String appkey;//应用秘钥

	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getAppkey() {
		return appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	
	/**
	 * @Bean作用于方法上向springIOC容器之中注入一个Bean.
	 * 方法名对应Bean名
	 * 返回值类型对应Bean的类型
	 * 返回的值就是Bean对象
	 */
	
	@Bean
	public SmsSingleSender smsSingleSender() {
		return new SmsSingleSender(getAppid(), getAppkey());
	}
	
	@Bean
	public SmsMultiSender smsMultiSender() {
		return new SmsMultiSender(getAppid(), getAppkey());
	}

}
