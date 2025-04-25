package com.cts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String firstname;
	private String lastname;
	private String userphone;
	private String email;
	private String address;
	
	private User() {	
	}
	
	public User(long userId, String firstnanme, String lastname, String userphone, String email, String address) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.userphone = userphone;
		this.email = email;
		this.address = address;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", userphone="
				+ userphone + ", email=" + email + ", address=" + address + "]";
	}


//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long userId;
//
//	private String userType;
//	
//	private String userName;
//	
//	private long userPhone;
//	
//	private String password;
//	
//	private String email;
//	
//	public User() {
//	}
//	
//	public User(long userId, String userType, String userName, long userPhone, String password, String email) {
//		super();
//		this.userId = userId;
//		this.userType = userType;
//		this.userName = userName;
//		this.userPhone = userPhone;
//		this.password = password;
//		this.email = email;
//	}
//
//
//
//	public long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(long userId) {
//		this.userId = userId;
//	}
//
//	public String getUserType() {
//		return userType;
//	}
//
//	public void setUserType(String userType) {
//		this.userType = userType;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public long getUserPhone() {
//		return userPhone;
//	}
//
//	public void setUserPhone(long userPhone) {
//		this.userPhone = userPhone;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", userPhone="
//				+ userPhone + ", password=" + password + ", email=" + email + "]";
//	}


	
}
