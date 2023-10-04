package com.emp;

import java.sql.*;


public class DBcon {
	static Connection con;
	public static Connection createDBconnection() {
		
		
		
		try {
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="sairam12"; 
		con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
