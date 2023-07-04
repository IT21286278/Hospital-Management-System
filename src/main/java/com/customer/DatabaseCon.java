package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseCon{
	private static String url = "jdbc:mysql://localhost:3306/hospital"; 
	private static String user = "root";
	private static String password = "hasa123789";
	private static Connection con;

	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con  =DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Database has not connected successfully");
			
		}
		return con;
		
		
	}

	
	
}
