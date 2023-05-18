package com.hnc.nbaver.model.dao;

import java.util.List;

import com.hnc.nbaver.model.dto.NBAPlayer;

public interface NBADao {
	public List<NBAPlayer> selectAll();
	public NBAPlayer selectOne(String playerName);
}
