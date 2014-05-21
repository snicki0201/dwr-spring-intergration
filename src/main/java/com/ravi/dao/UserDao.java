package com.ravi.dao;

import java.util.List;

import com.ravi.model.User;

public interface UserDao {
	
	List<User> getUserByUserEmail(String userEmail);

}
