package com.mvsk.smc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvsk.smc.businesslogic.SendConfirmationEmail;
import com.mvsk.smc.entities.Login;
import com.mvsk.smc.entities.User;
import com.mvsk.smc.service.AdminService;


@RestController
//@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private SendConfirmationEmail sendMail;

	@PostMapping(value = "login")
	ResponseEntity<User> validateUser(@RequestBody Login login) {
		ResponseEntity<User> response = null;

		if (adminService.findUser(login.getUser_name(), login.getPassword()) != null) {
			User user = adminService.findUser(login.getUser_name(), login.getPassword());
			if(user.getConfirmation_status().equals("confirmed"))
			{
					if (user.getUser_type().equals("Admin")) {
						System.out.println(user);
						response = new ResponseEntity<>(user, HttpStatus.ACCEPTED);
						return response;

					}
					
				//	if(user.getUser_type().equals("User")) {
					else{
						System.out.println(user);
							response = new ResponseEntity<>(user, HttpStatus.CONTINUE);
							return response;

					}
			}
			 
//If the user is not confirmed
			else {
				response = new ResponseEntity<>(HttpStatus.FORBIDDEN);
				return response;

			}
			
		}
		else
		{
			response = new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			return response;

		}
			
		

		
	}
	
	@GetMapping("logout")
	ResponseEntity<String> logout()
	{
		ResponseEntity<String> response=  new ResponseEntity<>("You have been sucessfully logged out",HttpStatus.GONE);
		return response;
	}
	
	
	@GetMapping("mail")
	void sendMail()
	{
		sendMail.sendEmail("sddsd","dsfffffs");
	}
}
