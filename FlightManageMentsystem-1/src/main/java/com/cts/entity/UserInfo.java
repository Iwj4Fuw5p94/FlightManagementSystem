package com.cts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String name;
	private String email;
	private String password;
	private String role;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public UserInfo(long userId, String name, String email, String password, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", role=" + role + "]";
	}

}
