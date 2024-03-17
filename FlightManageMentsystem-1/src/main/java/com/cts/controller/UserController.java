package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.User;
import com.cts.exceptions.UserNotFoundException;
import com.cts.service.IUser;
import com.cts.service.UserImple;

import jakarta.persistence.PostLoad;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserImple iserImple;
	
	@PostMapping("/add")
	
	public User addUser(@RequestBody User user) throws UserNotFoundException {
		System.out.println("Hello Welcome to the Front page ");
		return iserImple.addUser(user);
	}
	
	@GetMapping("/viewuser{userId}")
	public Optional<User> viewUser(@PathVariable long userId) throws UserNotFoundException {
		return iserImple.viewUser(userId);

}
	@GetMapping("/viewall")
	public List<User> viewList(){
		return iserImple.viewUser();
	}
	
	
}
