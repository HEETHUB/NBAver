package com.hnc.nbaver.model.service;

import java.util.List;

import com.hnc.nbaver.model.dto.Match;

public interface ScheduleService {

	List<Match> getMonthSchedule();

	List<Match> getDaySchedule(int day);
	
}
