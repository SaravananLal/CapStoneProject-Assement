package com.ltimindtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.request.CreateUserRequest;
import com.ltimindtree.response.UserResponse;
import com.ltimindtree.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/create")
	public UserResponse createUser (@RequestBody CreateUserRequest createUserRequest) {
		return userService.createUser(createUserRequest);
	}
	
	@GetMapping("getById/{id}")
	public UserResponse getById (@PathVariable long id) {
		return userService.getById(id);
	}
	
}
