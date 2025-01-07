package com.cts.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.entity.UserInfo;
import com.cts.exceptions.UserAlreadyExistException;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long>{
	
	public Optional<UserInfo> findByName(String userName);
	public boolean existsByEmail(String  email);
	
	

}
