package com.hnc.nbaver.model.dto;

public class Betting {
	private String team;
	private int num;
	
	public Betting(String team, int num) {
		super();
		this.team = team;
		this.num = num;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
