package com.hnc.nbaver.model.service;

import java.util.List;

import com.hnc.nbaver.model.dto.User;

public interface UserService {
	public List<User> getUserList();
	public void signUp(User user);
	public User logIn(String userId, String password);
}
