package com.hnc.nbaver.model.dao;

import java.util.List;

import com.hnc.nbaver.model.dto.Betting;
import com.hnc.nbaver.model.dto.User;

public interface UserDao {
	public List<User> selectAll();
	public void insertUser(User user);
	public User selectOne(String userId);
	public void bet(String userId, String side);
	public List<Betting> selectBettingResult();
}
