package com.model;

import java.sql.Date;

public class Account {
	private String username;
	private String password;
	private String email;
	private String address;
	private String fname;
	
	
	public Account()
	{
	
	}


	public Account(String username, String password, String email, String address, String fname) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.fname = fname;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}

	
	
	
}
	