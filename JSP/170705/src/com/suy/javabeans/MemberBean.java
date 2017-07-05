package com.suy.javabeans;

public class MemberBean {
	private String name;
	private String userID;

	public MemberBean() {
		super();
	}

	public MemberBean(String name, String userID) {
		super();
		this.name = name;
		this.userID = userID;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", userID=" + userID + "]";
	}
}
