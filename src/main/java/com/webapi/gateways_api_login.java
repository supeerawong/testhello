package com.webapi;

public class gateways_api_login {
	private String username;
	private String password;
	
	//username
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return this.username;
	}
	
	//password
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	
	//setlogin
	public void setlogin(String username,String password) {
		setUsername(username);
		setPassword(password);
	}
}
