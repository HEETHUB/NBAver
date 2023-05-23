package com.hnc.nbaver.model.dto;

//import java.util.String;

public class News {
	private String title; // 기사 제목
	private String originallink; // 원문 url 
	private String link; // 네이버 뉴스 url 
	private String description; // 기사 내용 요약 
	private String pubDate; // 뉴스 기사가 네이버에 제공된 시간.
	
	public News(String title, String originallink, String link, String description, String pubDate) {
		super();
		this.title = title;
		this.originallink = originallink;
		this.link = link;
		this.description = description;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginallink() {
		return originallink;
	}

	public void setOriginallink(String originallink) {
		this.originallink = originallink;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	
}
