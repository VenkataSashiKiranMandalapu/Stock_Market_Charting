package com.mvsk.smc.service;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvsk.smc.entities.User;

import org.springframework.data.jpa.repository.Modifying;

@Service("confirmUser")
public interface ConfirmUserEmailService extends JpaRepository<User,Integer>{
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE user SET confirmation_status = 'confirmed' WHERE user_name = :user_name",nativeQuery = true)
	 int confirmUser(@Param("user_name")String user_name);

}
