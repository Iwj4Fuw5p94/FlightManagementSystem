package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.UserInfoRepository;
import com.cts.entity.UserInfo;
import com.cts.exceptions.UserAlreadyExistException;
import com.cts.service.JwtService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthRequest {
	@Autowired
	JwtService jwtService;
	
	@Autowired
	UserInfoRepository repository;
	
	@PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserInfo userInfo) throws UserAlreadyExistException {
			jwtService.addUser(userInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully!");
    }
	
//	 @PostMapping("/add")
//	    public ResponseEntity<String> addUser(@RequestBody UserInfo userInfo) {
//	        try {
//	            repository.add(userInfo);
//	            return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
//	        } catch (UserAlreadyExistException e) {
//	            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
//	        }
//	    }
	
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
