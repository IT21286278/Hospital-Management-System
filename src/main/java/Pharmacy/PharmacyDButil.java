package Pharmacy;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Part;


public class PharmacyDButil {
	
	//declare static varibles
	private static boolean isSuccess;
	private static Connection con = null;
	private static PreparedStatement pstmt = null;
	private static String sql1 = null;
	private static ResultSet rs = null;
	private static int lastInsertedId = -1;
	private static int result;
	
	//method to insert data to table
	public static boolean submitPrecription(String title, String name, String nic, String address, int age, String gender, 
			String mobileNo, String email, String comment) {
		
		isSuccess = false;
		try {
			
			
			con = DBconnect.getConnection();
			
            sql1 = "insert into online_pharmacy(Date,Title,Name,NIC,Address,Age,Gender,MobileNo,Email,Comment) "
            		+ "values (?,?,?,?,?,?,?,?,?,?)";
            
			pstmt = con.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			
			//bind values
			pstmt.setTimestamp(1, date);
			pstmt.setString(2, title);
			pstmt.setString(3, name);
			pstmt.setString(4, nic);
			pstmt.setString(5, address);
			pstmt.setInt(6, age);
			pstmt.setString(7, gender);
			pstmt.setString(8, mobileNo);
			pstmt.setString(9, email);
			pstmt.setString(10, comment);
			
			result = pstmt.executeUpdate(); //execute sql query
			
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if(rs.next()){
				lastInsertedId = rs.getInt(1);
			}
			
			if(result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//method to get last inserted id
	public static int getlastInsertedId() {
		
		return lastInsertedId;
	}
	
	//method to retrieve data from the database
	public static List<PharmacyCustomer> getFormDetails(int lastid){
		
		ArrayList<PharmacyCustomer> phCustomer = new ArrayList<>();
	
		try {
			con = DBconnect.getConnection();
		
			sql1 = "select * from online_pharmacy where OID = ?";
			pstmt = con.prepareStatement(sql1);
		
			pstmt.setInt(1, lastid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt(1);
				Date date = rs.getDate(2);
				String title = rs.getString(3);
				String name = rs.getString(4);
				String nic = rs.getString(5);
				String address = rs.getString(6);
				int age = rs.getInt(7);
				String gender = rs.getString(8);
				String mobileNo = rs.getString(9);
				String email = rs.getString(10);
				String comment = rs.getString(11);
				
				PharmacyCustomer cus = new PharmacyCustomer(cid, date, title, name, nic, address, age, gender, mobileNo, email, comment);
				phCustomer.add(cus);
				
			}
			
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		return phCustomer;
	}
	
	//method to update form data
	public static boolean updateFormData(int id, String title, String name, String nic, String address, int age, String gender, 
			String mobileNo, String email, String comment) {
		
		try {
			
			con = DBconnect.getConnection();
			
			sql1 = "update online_pharmacy set Title = ?, Name = ?, Nic = ?, Address = ?, Age = ?, Gender = ?, MobileNo = ?,"
					+ "Email = ?, comment = ? where OID = ?";
			
			pstmt = con.prepareStatement(sql1);
			
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, nic);
			pstmt.setString(4, address);
			pstmt.setInt(5, age);
			pstmt.setString(6, gender);
			pstmt.setString(7, mobileNo);
			pstmt.setString(8, email);
			pstmt.setString(9, comment);
			pstmt.setInt(10, id);
			
		    result = pstmt.executeUpdate();
			
			if(result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	//method to upload prescription to the database
	public static boolean uploadPrescription(int id, Part prescriptionImg) {
		
		try {
			
			con = DBconnect.getConnection();
			InputStream inputPrescription = prescriptionImg.getInputStream();
			
			sql1 = "update online_pharmacy set Prescription = ? where OID = ?";
			
			pstmt = con.prepareStatement(sql1);
			pstmt.setBlob(1, inputPrescription);
			pstmt.setInt(2, id);
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//method to delete record from the database
	public static boolean cancelPharmacyRequest(int oid) {
	
		try {
			
			con = DBconnect.getConnection();
			sql1 = "delete from online_pharmacy where OID = ?";
			
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, oid);
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return isSuccess;
	}
	
}
