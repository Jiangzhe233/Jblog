package com.eve.bean;

public class User {
	private String username;
	private String password;
	private String remark;
	public User(){
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public User(String username, String password, String remark) {
		super();
		this.username = username;
		this.password = password;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "BaseInfoBean [username=" + username + ", password=" + password
				+ ", remark=" + remark + "]";
	}
	
}
