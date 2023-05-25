package com.hnc.nbaver.model.dto;

public class Board {
	private int id;
	private String userId;
	private int playerId;
	private String team;
	private String title;
	private String writer;
	private int viewCnt;
	private String regDate;
	private String content; 
	
	public Board() {}

	// 게시글 생성을 위해!
	public Board(String userId, int playerId, String team, String title, String writer, String content) {
		this.userId = userId;
		this.playerId = playerId;
		this.team = team;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	// 게시글 수정을 위해!
	public Board(String team, String title, String writer, String content) {
		this.team = team;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	public Board(int id, String userId, int playerId, String team, String title, String writer, int viewCnt, String regDate, String content) {
		this.id = id;
		this.userId = userId;
		this.playerId = playerId;
		this.team = team;
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

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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

	@Override
	public String toString() {
		return "Board [id=" + id + ", userId=" + userId + ", title=" + title + ", writer=" + writer + ", viewCnt="
				+ viewCnt + ", regDate=" + regDate + ", content=" + content + "]";
	}
}
