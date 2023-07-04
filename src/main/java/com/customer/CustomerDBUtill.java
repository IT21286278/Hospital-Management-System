package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CustomerDBUtill {
	
	private static boolean issuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Customer> validate(String userName , String Password){
		
		
		ArrayList<Customer> cus= new ArrayList<>();
		
		
		
		try {
			
			
			con = DatabaseCon.getConnection();
			
			stmt = con.createStatement();
			
			String sql = "select * from userdetails where username = '"+userName+"' and password = '"+Password+"'"; 
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				Customer c = new Customer(id,name,email,phone,userU,passU);
				cus.add(c);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		
		return cus;
		
		
	}


public static boolean registerUser( String name , String email ,String phone ,String uName,String pass){
	
	issuccess = false;
	
	
	
	try {
		
		
		con = DatabaseCon.getConnection();
		
		stmt = con.createStatement();
		
		
		String sql = "Insert INTO userdetails VALUES (0,'"+name+"','"+email+"','"+phone+"','"+uName+"','"+pass+"')"; 
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			issuccess = true;
		}else {
			issuccess =false;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	
	
	
	return issuccess;
	
	
	
	
	
}


public static boolean updateAccount(String id , String name, String email ,String phone, String username ,String password) {
	
	try {
		
		con = DatabaseCon.getConnection();
		
		stmt = con.createStatement();
		
		String sql = "Update userdetails set name ='"+name+"',email='"+email+"' , phone = '"+phone+"', username ='"+username+"', password = '"+password+"' where id='"+id+"'"; 
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			issuccess = true;
			
		}else {
			issuccess = false;
		
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return issuccess;
	
	
	
}

public static  List<Customer> getPatientDetails(String id){
	ArrayList<Customer> cus = new ArrayList<>();
	
	int idConvert = Integer.parseInt(id);
	
	try {
		con = DatabaseCon.getConnection();
		stmt = con.createStatement(); 			
		String sql = "Select * from userdetails  where id = '"+idConvert+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int Id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phone = rs.getString(3);
			String username = rs.getString(4);
			String password = rs.getString(5);
			
			Customer c = new Customer(Id,name,email,phone,username,password);
			cus.add(c);
			
			
		}
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return cus;
	
	
}

public static boolean deleteAccount(String id) {
	
	int idConvert = Integer.parseInt(id);
	
	try {
		con = DatabaseCon.getConnection();
		stmt = con.createStatement();
		String sql = "delete from userdetails where id = '"+idConvert+"'"; 
		int r = stmt.executeUpdate(sql);
		
		if(r>0) {
			issuccess = true;
		}else {
			issuccess = false;
		}

	
	} catch (Exception e) {
		e.printStackTrace();
	
	}
	
	
	
	return issuccess;
	
	
	
}
	
	
}
