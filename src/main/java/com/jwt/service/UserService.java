package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.model.User;

@Service
public class UserService {
	
	private List<User> store=new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"MANGESH","mangesh.pakhale@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"PRITAM","pritam.pakhale@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"AMIT","amit.baroda@gmail.com"));

	}
	public List<User> getUser(){
		return this.store;
	}
	

}
