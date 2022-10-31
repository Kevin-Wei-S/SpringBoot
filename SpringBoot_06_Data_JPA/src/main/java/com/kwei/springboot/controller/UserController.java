package com.kwei.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kwei.springboot.entities.User;
import com.kwei.springboot.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user/get/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		Optional<User> option = userRepository.findById(id);
		return option.orElse(null);
	}
	
	@GetMapping("/user/get")
	public List<User> getAllUsers(){
		List<User> users = userRepository.findAll();
		return users;
	}
	
	@GetMapping("/user/save/{id}/{username}/{password}/{email}")
	public User saveUser(@PathVariable("id") String strId,
							@PathVariable("username") String username,
						 	@PathVariable("password") String password, 
						  	@PathVariable("email") String email) {
		Integer id = null;
		try {
			id = Integer.parseInt(strId);
		} catch(Exception e) {}
		User user = new User(id, username, password, email);
		userRepository.save(user);
		return user;
	}
	
	@GetMapping("/user/delete/{id}")
	public User deleteUser(@PathVariable("id") Integer id) {
		Optional<User> option = userRepository.findById(id);
		User user = option.orElse(null);
		if(user != null) {
			userRepository.deleteById(id);
		}
		return user;
	}
	
}
