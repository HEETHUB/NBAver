package com.hnc.nbaver.model.dto;

public class User {
	private String userId;
	private String password;
	private String userName;
	private String email;
	private String userImg;
	
	public User() {}

	public User(String userId, String password, String userName, String email, String userImg) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.userImg = userImg;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", userName=" + userName + ", email=" + email
				+ ", userImg=" + userImg + "]";
	}
}
