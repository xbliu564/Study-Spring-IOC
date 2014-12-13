package com.bin.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bin.spring.beans.annotation.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository ;
	/*
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}*/
	public void add(){
		System.out.println("UserService add...");
		userRepository.save();
	}
}
