package com.hnc.nbaver.model.dto;

public class Match {
	private int month;
	private int day;
	private String dow;
	private String hour;
	private String teamLeft;
	private String teamRight;
	private String score;
	
	public Match() {}

	public Match(int month, int day, String dow, String hour, String teamLeft, String teamRight, String score) {
		super();
		this.month = month;
		this.day = day;
		this.dow = dow;
		this.hour = hour;
		this.teamLeft = teamLeft;
		this.teamRight = teamRight;
		this.score = score;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getDow() {
		return dow;
	}

	public void setDow(String dow) {
		this.dow = dow;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getTeamLeft() {
		return teamLeft;
	}

	public void setTeamLeft(String teamLeft) {
		this.teamLeft = teamLeft;
	}

	public String getTeamRight() {
		return teamRight;
	}

	public void setTeamRight(String teamRight) {
		this.teamRight = teamRight;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	
}
