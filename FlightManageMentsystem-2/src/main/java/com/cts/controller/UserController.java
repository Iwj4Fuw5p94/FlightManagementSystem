package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.User;
import com.cts.exceptions.UserNotFoundException;
import com.cts.service.IUser;
import com.cts.service.UserImple;

import ch.qos.logback.classic.Logger;
import jakarta.persistence.PostLoad;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserImple iserImple;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) throws UserNotFoundException {
		System.out.println("Hello Welcome to the Front page ");
		System.out.println(user);
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
	
	@DeleteMapping("/deleteById{userId}")
	public String deleteString(@RequestBody @PathVariable long userId) throws UserNotFoundException {
		iserImple.deleteUser(userId);
		
		return "user deleted ";
	}
	
	@PutMapping("/update")
	
	public User updateUser(@RequestBody User user) throws UserNotFoundException{
		return iserImple.updateUSer(user);
	}
}
