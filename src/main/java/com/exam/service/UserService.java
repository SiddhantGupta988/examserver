package com.exam.service;

import java.util.Set;

import com.exam.models.User;
import com.exam.models.UserRole;

public interface UserService {

	
	//create user
	User createUser(User user, Set<UserRole> userRoles);
	
	//find user
	User findUser(String username);
	
	//delete user
	void deleteUser(Long id);
	
	
}
