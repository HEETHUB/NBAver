package com.hnc.nbaver.model.service;

import java.util.List;

import com.hnc.nbaver.model.dto.NBAPlayer;

public interface NBAService {
	public List<NBAPlayer> getPlayerList();
	public NBAPlayer getPlayer(String playerName);
}
