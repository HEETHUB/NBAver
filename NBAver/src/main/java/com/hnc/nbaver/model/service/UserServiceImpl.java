package com.hnc.nbaver.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.model.dao.UserDao;
import com.hnc.nbaver.model.dto.Betting;
import com.hnc.nbaver.model.dto.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUserList() {
		return userDao.selectAll();
	}

	@Override
	public void signUp(User user) {
		userDao.insertUser(user);
	}

	@Override
	public User logIn(String userId, String password) {
		User temp = userDao.selectOne(userId);
		if (temp != null && temp.getPassword().equals(password))
			return temp;
		return null;
	}

	@Override
	public void bet(String userId, String side) {
		System.out.println(userId+" 회원님이 "+side+" 팀에 베팅하셨습니다.");
		userDao.bet(userId, side);
	}

	@Override
	public List<Betting> getBetting() {
		System.out.println("오늘의 경기 승부예측 결과를 가져옵니다.");
		return userDao.selectBettingResult();
	}

}
