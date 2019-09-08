package com.mvsk.smc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvsk.smc.entities.User;

@Repository("userRepos")
public interface UserRepos extends JpaRepository<User,Integer>{

}
