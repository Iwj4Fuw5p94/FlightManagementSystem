package com.cts.dao;

import java.util.List;

import com.cts.entity.User;

public interface IUserDao {
	
	public User addUser(User user);
	
	public User viewUser(long userId);
	
	public List<User> viewUser();
	
	public User updateUSer(User user);
	
	public void deleteUser(User userId);
	
	
	

}
