package Pharmacy;

import java.sql.Date;

public class PharmacyCustomer {

	private int cid;
	private Date date;
	private String title;
	private String name;
	private String nic;
	private String address;
	private int age;
	private String gender;
	private String mobileNo;
	private String email;
	private String comment;
	
	
	public PharmacyCustomer(int cid, Date date, String title, String name, String nic, String address, int age,
			String gender, String mobileNo, String email, String comment) {
		
		this.cid = cid;
		this.date = date;
		this.title = title;
		this.name = name;
		this.nic = nic;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.email = email;
		this.comment = comment;
	}

	public int getCid() {
		return cid;
	}

	public Date getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNic() {
		return nic;
	}
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getComment() {
		return comment;
	}
	
	
}
