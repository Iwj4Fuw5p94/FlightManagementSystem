package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.IUserDao;
import com.cts.entity.User;
import com.cts.exceptions.UserNotFoundException;

@Service
public class UserImple implements IUser {
	@Autowired
	IUserDao iUserDao;

	@Override
	public User addUser(User user) throws UserNotFoundException {
//		User savedUser = iUserDao.save(user);
//		if (savedUser == null) {
//			throw new UserNotFoundException("Failed to add new User");
//		} else {
//			return savedUser;
//		}
		return iUserDao.save(user);
	}

	@Override
	public Optional<User> viewUser(long userId) throws UserNotFoundException {

		Optional<User> findOptional = iUserDao.findById(userId);
		if (findOptional.isEmpty()) {
			throw new UserNotFoundException("user not found for id " + userId);

		}

		return findOptional;

//		return iUserDao.findById(userId);
	}

	@Override
	public List<User> viewUser() {

		return iUserDao.findAll();
	}

	@Override
	public User updateUSer(User user) {
		
		return null;
	}

	@Override
	public void deleteUser(User userId) {
		// TODO Auto-generated method stub

	}

}
