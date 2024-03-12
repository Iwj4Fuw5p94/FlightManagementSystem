package com.cts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private String userType;
	private long userId;
	private String userName;
	private long userPhone;
	private String password;
	private String email;
	
	public User() {
	}

	
	public User(String userType, long userId, String userName, long userPhone, String password, String email) {
		super();
		this.userType = userType;
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.password = password;
		this.email = email;
	}


	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
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
	
	@Override
	public String toString() {
		return "User [userType=" + userType + ", userId=" + userId + ", userName=" + userName + ", userPhone="
				+ userPhone + ", password=" + password + ", email=" + email + "]";
	}

	
}
