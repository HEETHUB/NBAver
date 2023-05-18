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
import com.hnc.nbaver.model.service.NBAService;

@RestController
@RequestMapping("api/nba")
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
	public ResponseEntity<?> getPlayer(@PathVariable("playerName") String playerName){
		NBAPlayer player = nbaService.getPlayer(playerName);
		if (player == null) 
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<NBAPlayer>(player, HttpStatus.OK);
	}
}
