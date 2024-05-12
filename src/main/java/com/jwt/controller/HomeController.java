package com.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.service.UserService;

@RestController
public class HomeController {
	@Autowired
	private UserService userService;
	
	//http://localhost:8081/user
	@GetMapping("/user")
	public List<User> getuser() {
		System.out.println("gatteing user");
		return userService.getUser();
	}
	
	@GetMapping("/current-user")
	public String getLoginuser(Principal principal) {
		return principal.getName();
	}
	
	

}
