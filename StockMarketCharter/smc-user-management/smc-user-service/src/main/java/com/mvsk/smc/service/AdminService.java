package com.mvsk.smc.service;

import com.mvsk.smc.entities.User;

public interface AdminService  {
	
	public User findUser(String user_name, String password);

}
