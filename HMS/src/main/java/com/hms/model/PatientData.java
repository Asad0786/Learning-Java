package com.hms.model;

public class PatientData extends LoginUserData {


	
//	private String name;
//	private String email;
	private String password;
//	private String dob;
//	private String gender;
//
//	
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String lname) {
//		this.name = lname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = "1234"+ password.toLowerCase();
	}
//
//	public String getDob() {
//		return dob;
//	}
//
//	public void setDob(String dob) {
//		this.dob = dob;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}

}
