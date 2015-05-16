package com.epam.lab.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection con = null;
	
	private ConnectionManager(){
		
	}
	
	public static Connection getConnection(){
		if(con == null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String jdbcUrl = "jdbc:mysql://localhost:3306/user";
				String user = "root";

				String password = "root";

			 con =   DriverManager.getConnection(jdbcUrl,user,password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
		return con;
	} 
	
	
}
