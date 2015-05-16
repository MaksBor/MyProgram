package com.epam.lab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.lab.connector.ConnectionManager;
import com.epam.lab.model.UserModel;
import com.epam.lab.transformer.UserTransformer;

public class UserDAO {

	public static List<UserModel> getAll(){
		ResultSet rs = null;
		
		try {
			PreparedStatement ps = ConnectionManager.getConnection().prepareStatement("Select * From User");
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return UserTransformer.getAll(rs);
	}
	
	public static void addUser(UserModel u){
		
		try {
			PreparedStatement ps = ConnectionManager.getConnection().prepareStatement("INSERT INTO user VALUE(?,?,?,?,?,?)");
			ps.setString(1, u.getLogin());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstname());
			ps.setString(4, u.getLastname());
			ps.setString(5, u.getGender());
			ps.setInt(6, u.getAge());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
