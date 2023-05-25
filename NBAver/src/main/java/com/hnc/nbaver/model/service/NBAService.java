package com.hnc.nbaver.model.service;

import java.io.IOException;
import java.util.List;

import com.hnc.nbaver.model.dto.NBAPlayer;
import com.hnc.nbaver.model.dto.News;
import com.hnc.nbaver.model.dto.PlayerStat;
import com.hnc.nbaver.model.dto.TeamStat;
import com.hnc.nbaver.model.dto.Video;

public interface NBAService {
	public List<PlayerStat> getPlayerList();
	public NBAPlayer getPlayer(String playerName);
	public List<PlayerStat> getPlayerStat(int id);
	public List<TeamStat> getTeamStat();
	public List<News> getNews(String keyword) throws IOException;
	public List<Video> getVideos(String keyword) throws Exception;
}
