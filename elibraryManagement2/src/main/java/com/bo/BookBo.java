package com.bo;

import java.sql.Date;

public class BookBo {
	
	private String fullName;
	private String dob;
	private String email;
	private String mobNo;
	private String gender;
	private String occupation;
	private String idType;
	private String idNumber;
	private String issueAuthority;
	private String issueDate;
	private String expDate;
	private String password;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getIssueAuthority() {
		return issueAuthority;
	}
	public void setIssueAuthority(String issueAuthority) {
		this.issueAuthority = issueAuthority;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BookBo(String fullName, String dob, String email, String mobNo, String gender, String occupation,
			String idType, String idNumber, String issueAuthority, String issueDate, String expDate, String password) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.email = email;
		this.mobNo = mobNo;
		this.gender = gender;
		this.occupation = occupation;
		this.idType = idType;
		this.idNumber = idNumber;
		this.issueAuthority = issueAuthority;
		this.issueDate = issueDate;
		this.expDate = expDate;
		this.password = password;
	}
	public BookBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}