package com.hnc.nbaver.model.service;

import java.util.List;

import com.hnc.nbaver.model.dto.NBAPlayer;
import com.hnc.nbaver.model.dto.PlayerStat;

public interface NBAService {
	public List<NBAPlayer> getPlayerList();
	public NBAPlayer getPlayer(String playerName);
	public List<PlayerStat> getPlayerStat(int id);
}
