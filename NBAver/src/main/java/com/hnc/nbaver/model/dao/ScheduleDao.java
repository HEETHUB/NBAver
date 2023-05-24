package com.hnc.nbaver.model.dao;

import java.util.List;

import com.hnc.nbaver.model.dto.Match;

public interface ScheduleDao {
	List<Match> selectMonthSchedule();
	
	List<Match> selectDaySchedule(int day);
}
