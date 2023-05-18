package com.hnc.nbaver.model.dto;

public class NBAPlayer {
	private String playerId;
	private String playerName;
	private String link;
	private String birthDate;
	
	public NBAPlayer(String playerId, String playerName, String link, String birthDate) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.link = link;
		this.birthDate = birthDate;
	}
	
	public String getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
