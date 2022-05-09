package com.coolascode.app.service;

import com.coolascode.app.entity.User;

public interface IUserService {
	
	//custom method --in UserRepository
	public User findUserByNameAndPassword(String userName,String password);

}