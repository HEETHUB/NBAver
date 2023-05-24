package com.hnc.nbaver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnc.nbaver.model.dto.Match;
import com.hnc.nbaver.model.service.ScheduleService;

@RestController
@RequestMapping("server/schedule/")
public class ScheduleRestController {
	
	@Autowired
	private ScheduleService ss;
	
	// 스케줄 전부 가져오기
	@GetMapping("")
	public ResponseEntity<?> schedule(){
		List<Match> list = ss.getMonthSchedule();
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Match>>(list, HttpStatus.OK);
	}
	
	// 특정 날짜 스케줄 가져오기
	@GetMapping("{day}")
	public ResponseEntity<?> daySchedule(@PathVariable("day") int day){
		List<Match> list = ss.getDaySchedule(day);
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Match>>(list, HttpStatus.OK);
	}
	
}
