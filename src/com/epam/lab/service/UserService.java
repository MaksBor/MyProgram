package com.epam.lab.service;

import java.util.List;

import com.epam.lab.dao.UserDAO;
import com.epam.lab.model.UserModel;

public class UserService {

	public void addUser(UserModel user){
		UserDAO.addUser(user);
	}
	public static List<UserModel> getAllUser(){
		return UserDAO.getAll();
	}
}
