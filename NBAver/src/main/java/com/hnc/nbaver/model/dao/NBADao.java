package com.hnc.nbaver.model.dao;

import java.util.List;

import com.hnc.nbaver.model.dto.NBAPlayer;
import com.hnc.nbaver.model.dto.PlayerStat;
import com.hnc.nbaver.model.dto.TeamStat;

public interface NBADao {
	public List<NBAPlayer> selectAll();
	public NBAPlayer selectOne(String playerName);
	public List<PlayerStat> selectStatById(int id);
	public List<TeamStat> selectAllTeam();
}
