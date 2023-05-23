package com.hnc.nbaver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnc.nbaver.model.dto.NBAPlayer;
import com.hnc.nbaver.model.dto.News;
import com.hnc.nbaver.model.dto.PlayerStat;
import com.hnc.nbaver.model.dto.TeamStat;
import com.hnc.nbaver.model.dto.Video;
import com.hnc.nbaver.model.service.NBAService;

@RestController
@RequestMapping("server/nba")
public class NBARestController {
	
	@Autowired
	private NBAService nbaService;
	
	// 전체 선수 정보 가져오기
	@GetMapping("/all")
	public ResponseEntity<?> playerList(){
		List<NBAPlayer> list = nbaService.getPlayerList();
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<NBAPlayer>>(list, HttpStatus.OK);
	}
	
	// 검색한 선수 정보 가져오기
	@GetMapping("/player/{playerName}")
	public ResponseEntity<?> getPlayerStat(@PathVariable("playerName") String playerName){
		NBAPlayer player = nbaService.getPlayer(playerName);
		if (player == null) 
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		int id = Integer.parseInt(player.getPlayerId());
		System.out.println(id);
		List<PlayerStat> stat = nbaService.getPlayerStat(id);
		return new ResponseEntity<List<PlayerStat>>(stat, HttpStatus.OK);
	}
	
	// 팀 전체 스탯 가져오기
	@GetMapping("/team")
	public ResponseEntity<?> getTeamStat(){
		List<TeamStat> list = nbaService.getTeamStat();
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<TeamStat>>(list, HttpStatus.OK);
	}
	
	// 검색한 뉴스 정보 가져오기
	@GetMapping("/news/{keyword}")
	public ResponseEntity<?> getNews(@PathVariable("keyword") String keyword) throws Exception{
		List<News> news = nbaService.getNews(keyword);
		if (news == null || news.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<News>>(news, HttpStatus.OK);
	}
	
	// 검색한 유튜브 정보 가져오기
	@GetMapping("/videos/{keyword}")
	public ResponseEntity<?> getVideos(@PathVariable("keyword") String keyword) throws Exception{
		List<Video> videos = nbaService.getVideos(keyword);
		return new ResponseEntity<List<Video>>(videos, HttpStatus.OK);
	}
}
