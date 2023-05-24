package com.hnc.nbaver.model.dto;

public class Match {
	private String date;
	private String hour;
	private String teamLeft;
	private String teamRight;
	private String score;
	private String stadium;
	
	public Match() {}
	
	public Match(String date, String hour, String teamLeft, String teamRight, String score, String stadium) {
		super();
		this.date = date;
		this.hour = hour;
		this.teamLeft = teamLeft;
		this.teamRight = teamRight;
		this.score = score;
		this.stadium = stadium;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
}
