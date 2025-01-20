package com.cts.service;

import java.util.List;
import java.util.Optional;

import com.cts.entity.User;
import com.cts.exceptions.UserNotFoundException;

public interface IUser {
	
	public User addUser(User user) throws UserNotFoundException;
	
	public  Optional<User> viewUser(long userId) throws UserNotFoundException;
	
	public List<User> viewUser() throws UserNotFoundException;
	
	public User updateUSer(User user) throws UserNotFoundException;
	
	public void deleteUser(Long userId);
	
	
	

}
