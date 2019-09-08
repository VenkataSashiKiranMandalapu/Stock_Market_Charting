package com.mvsk.smc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RestController;

import com.mvsk.smc.service.ConfirmUserEmailService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ConfirmUserEmail {
	
	
	@Autowired
	private ConfirmUserEmailService confirmUser;
	
	@GetMapping("confirm_user/{user_name}")
	void confirmEmail(@PathVariable  String user_name)
	{
		System.out.println(user_name);
		confirmUser.confirmUser(user_name);
	}
	}
	


