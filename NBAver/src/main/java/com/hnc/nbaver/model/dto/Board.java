package com.hnc.nbaver.model.dto;

public class Board {
	private int id;
	private String userId;
	private String title;
	private String writer;
	private int viewCnt;
	private String regDate;
	private String content; 
	
	public Board() {}

	public Board(String userId, String title, String writer, String content) {
		this.userId = userId;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	
	public Board(int id, String userId, String title, String writer, int viewCnt, String regDate, String content) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.writer = writer;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
