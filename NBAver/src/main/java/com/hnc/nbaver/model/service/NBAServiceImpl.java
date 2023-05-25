package com.hnc.nbaver.model.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.api.NaverAPI;
import com.hnc.nbaver.api.YoutubeAPI;
import com.hnc.nbaver.model.dao.NBADao;
import com.hnc.nbaver.model.dto.NBAPlayer;
import com.hnc.nbaver.model.dto.News;
import com.hnc.nbaver.model.dto.PlayerStat;
import com.hnc.nbaver.model.dto.TeamStat;
import com.hnc.nbaver.model.dto.Video;

@Service
public class NBAServiceImpl implements NBAService {

	@Autowired
	private NBADao nbaDao;
	
	@Autowired
	private YoutubeAPI youtubeApi;
	
	@Autowired
	private NaverAPI naverApi;
	
	@Override
	public List<PlayerStat> getPlayerList() {
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

	@Override
	public List<News> getNews(String keyword) throws IOException {
		return naverApi.requestNews(keyword);
	}

	@Override
	public List<TeamStat> getTeamStat() {
		return nbaDao.selectAllTeam();
	}

	@Override
	public List<Video> getVideos(String keyword) throws Exception {
		return youtubeApi.search(keyword);
	}

}
