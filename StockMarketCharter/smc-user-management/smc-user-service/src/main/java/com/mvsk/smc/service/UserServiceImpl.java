package com.mvsk.smc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.User;
import com.mvsk.smc.repos.UserRepos;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepos userRepos;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepos.save(user);
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepos.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		userRepos.deleteById(id);
		
	}
	
	
}
