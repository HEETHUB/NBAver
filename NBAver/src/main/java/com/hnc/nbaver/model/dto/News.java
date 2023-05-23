package com.hnc.nbaver.model.dto;

import java.util.Date;

public class News { 
	private Date lastBuildDate; // 검색 결과 생성 시간
	private int total; // 총 검색 결과 개수
	private int start; // 검색 시작 위치
	private int display; // 한 번에 표시할 검색 결과 개수
	private Item item; // 뉴스 내용
}
