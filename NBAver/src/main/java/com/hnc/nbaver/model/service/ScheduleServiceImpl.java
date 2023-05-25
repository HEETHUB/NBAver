package com.hnc.nbaver.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.model.dao.ScheduleDao;
import com.hnc.nbaver.model.dto.Match;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao sd;
	
	@Override
	public List<Match> getMonthSchedule() {
		System.out.println("이번 달의 모든 경기 일정을 가져옵니다.");
		return sd.selectMonthSchedule();
	}

	@Override
	public List<Match> getDaySchedule(int day) {
		System.out.println(day+"일자 모든 경기를 가져옵니다.");
		return sd.selectDaySchedule(day);
	}

}
