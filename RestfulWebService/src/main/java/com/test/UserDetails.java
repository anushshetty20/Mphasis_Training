package com.test;

public class UserDetails {
	private int id;
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private long phone;
	
	public UserDetails() {

	}

	public UserDetails(int id, String fname, String lname, String email, long phone) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
}
