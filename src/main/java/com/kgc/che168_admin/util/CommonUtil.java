package com.kgc.che168_admin.util;

import java.util.Date;
import java.util.Random;

public class CommonUtil {
	
	//生成验证码随机数
	public static String identyCode() {
		Random random = new Random();
		int a;
		String result="";
		for(int j=0;j<6;j++) {
			a=Math.abs(random.nextInt()%9);
			result+=String.valueOf(a);
		}
		return result;
	}
	//生成唯一用户名(暂不实现唯一性)
	public static String getUserName(int length) {
		String val = "esc";  
		Random random = new Random();  
		//参数length，表示生成几位随机数  
		for(int i = 0; i < (length-3); i++) {  
		String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";  
		//输出字母还是数字  
		if( "char".equalsIgnoreCase(charOrNum) ) {  
		//输出是大写字母还是小写字母  
		int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;  
		val += (char)(random.nextInt(26) + temp);  
		} else if( "num".equalsIgnoreCase(charOrNum) ) {  
		val += String.valueOf(random.nextInt(10));  
		}  
		}  
		return val;
	}
}
