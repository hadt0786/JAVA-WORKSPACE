package com.Design_a_Logistics_System;

public class User {

	private int userId;
	private String name, mobNo, emailId;
	private Location adress;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Location getAdress() {
		return adress;
	}

	public void setAdress(Location adress) {
		this.adress = adress;
	}

}
