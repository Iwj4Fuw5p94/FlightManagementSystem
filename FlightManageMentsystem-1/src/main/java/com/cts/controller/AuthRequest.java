package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.UserInfoRepository;
import com.cts.entity.UserInfo;
import com.cts.service.JwtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/auth")
public class AuthRequest {
	@Autowired
	JwtService jwtService;
	
	@Autowired
	UserInfoRepository repository;
	
	
	
	@PostMapping("/register")
    public String register(@RequestBody UserInfo userInfo) {
        repository.save(userInfo);
        userInfo.setRole("ROLE_USER"); // Default role
        return "User registered successfully!";
    }
	
	public UserInfo registerUser(UserInfo userInfo) {
	    if (userInfo.getRole() == null || userInfo.getRole().isEmpty()) {
	        userInfo.setRole("ROLE_USER"); // Default role
	    }
	    return repository.save(userInfo);
	}

	 @PostMapping("/authenticate")
	    public String authenticate(@RequestBody UserInfo userInfo) {
	        UserInfo existingUser = repository.findByName(userInfo.getName())
	                .orElseThrow(() -> new RuntimeException("User not found!"));

	        if (existingUser.getPassword().equals(userInfo.getPassword())) {
	            return jwtService.generateToken(userInfo.getName());
	        } else {
	            throw new RuntimeException("Invalid credentials!");
	        }
	    }
	
	

}
