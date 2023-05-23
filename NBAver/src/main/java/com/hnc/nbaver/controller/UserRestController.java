package com.hnc.nbaver.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnc.nbaver.model.dto.User;
import com.hnc.nbaver.model.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	// 회원가입
	@PostMapping("signup")
	public ResponseEntity<User> signUp(User user){
		System.out.println(user.getUserName()+"님을 새로운 유저로 등록합니다.");
		userService.signUp(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	// Log in
	@PostMapping("login")
	public ResponseEntity<?> login(User user, HttpSession session) {
		User loginUser = userService.logIn(user.getUserId(), user.getPassword());
		if (loginUser == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		session.setAttribute("loginUser", loginUser.getUserName());
		return new ResponseEntity<User>(loginUser, HttpStatus.OK);
	}
	
	// Log out
	@GetMapping("logout")
	public ResponseEntity<?> logout(HttpSession session){
		session.invalidate();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// take all users
	@GetMapping("users")
	public ResponseEntity<?> userList(){
		List<User> list = userService.getUserList();
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
}
