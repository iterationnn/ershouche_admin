package com.kgc.che168_admin.util;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

//短信发送类
@Component
public class SMS {
	@Autowired
	private SmsSingleSender sender;
	
	private static SMS sms;
	
	@PostConstruct
	public void init() {
		sms=this;
		sms.sender=this.sender;
	}
	//登录短信
	public static SmsSingleSenderResult send(String phoneNo,String identyCode) {
		String msg = "【循环与递归公众号】%s为您的登录验证码，请于%s分钟内填写。如非本人操作，请忽略本短信。";
		SmsSingleSenderResult sResult=null;
		try {
			sResult = sms.sender.send(0, "86", phoneNo, String.format(msg, identyCode,"1"), null, null);
		} catch (HTTPException | JSONException | IOException e) {
			e.printStackTrace();
		}
		return sResult;
	}
	
	//注册成功后短信通知
	public static SmsSingleSenderResult regNotice(String phoneNo,String userName,String password) {
		String msg = "【循环与递归公众号】感谢您注册本网站,账号/登录名：%s，初始密码：%s。为了账号安全及不影响操作，请及时登录修改用户名及密码。";
		SmsSingleSenderResult sResult=null;
		try {
			sResult = sms.sender.send(0, "86", phoneNo, String.format(msg, userName,password), null, null);
		} catch (HTTPException | JSONException | IOException e) {
			e.printStackTrace();
		}
		return sResult;
	}
}
