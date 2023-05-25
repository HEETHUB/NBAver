package com.hnc.nbaver.model.dto;

public class Video {
	private String title;
	private String description;
	private String publishTime;
	private String thumbnails;
	private String channelTitle;
	private String videoId;
	
	public Video(String title, String description, String publishTime, String thumbnails, String channelTitle,
			String videoId) {
		super();
		this.title = title;
		this.description = description;
		this.publishTime = publishTime;
		this.thumbnails = thumbnails;
		this.channelTitle = channelTitle;
		this.videoId = videoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
	public String getChannelTitle() {
		return channelTitle;
	}
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
}
