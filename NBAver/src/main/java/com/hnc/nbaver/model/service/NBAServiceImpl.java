package com.hnc.nbaver.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.model.dao.NBADao;
import com.hnc.nbaver.model.dto.NBAPlayer;
import com.hnc.nbaver.model.dto.PlayerStat;

@Service
public class NBAServiceImpl implements NBAService {

	@Autowired
	private NBADao nbaDao;
	
	@Override
	public List<NBAPlayer> getPlayerList() {
		return nbaDao.selectAll();
	}

	@Override
	public NBAPlayer getPlayer(String playerName) {
		return nbaDao.selectOne(playerName);
	}

	@Override
	public List<PlayerStat> getPlayerStat(int id) {
		return nbaDao.selectStatById(id);
	}

}
