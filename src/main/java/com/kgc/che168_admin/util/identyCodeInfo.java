package com.kgc.che168_admin.util;

public class identyCodeInfo {
	private String code;
	private String phone;
	private long timeMill;//发送验证码的时间
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getTimeMill() {
		return timeMill;
	}
	public void setTimeMill(long timeMill) {
		this.timeMill = timeMill;
	}
	
	
}
