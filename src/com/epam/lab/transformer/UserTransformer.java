package com.epam.lab.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.lab.model.UserModel;

public class UserTransformer {

	public static List<UserModel> getAll(ResultSet rs){
		List<UserModel> us = new ArrayList<UserModel>();
		UserModel model = null;
		try {
			while(rs.next()){
				model = new UserModel();
				model.setLogin(rs.getString(1));
				model.setPassword(rs.getString(2));
				model.setFirstname(rs.getString(3));
				model.setLastname(rs.getString(4));
				model.setGender(rs.getString(5));
				model.setAge(rs.getInt(6));
				us.add(model);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return us;
	}
}
