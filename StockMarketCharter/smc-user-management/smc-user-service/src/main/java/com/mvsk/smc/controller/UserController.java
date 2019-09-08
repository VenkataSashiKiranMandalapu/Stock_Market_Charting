package com.mvsk.smc.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvsk.smc.businesslogic.SendConfirmationEmail;
import com.mvsk.smc.entities.User;
import com.mvsk.smc.service.UserService;

@RestController
public class UserController {

	@Autowired UserService userService;
	 
	@Autowired
	private SendConfirmationEmail sendMail;
	
	
	@PostMapping("/user") User create(@RequestBody User user) {
	 
	sendMail.sendEmail(user.getEmail(),user.getUser_name());

	 return userService.save(user); }
	 
	
	 
	 
	 @GetMapping("/user") Iterable<User> read() {return userService.findAll();}
	 
	 
	 @PutMapping("/user") User update(@RequestBody User user) { return
	 userService.save(user); }
	  
	  
	  @DeleteMapping("/user/{id}") void delete(@PathVariable Integer id) {
	  userService.deleteById(id); }
	
	
	
	
	
	
	
}
