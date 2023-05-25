package com.hnc.nbaver.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.model.dto.Video;

@Service
public class YoutubeAPI {
//	private final String API_KEY = "AIzaSyCq_ZPl2zwSxymsp6GFQCLnRNhdv38msCI";
	private final String API_KEY = "AIzaSyCOIZ_xjudMvNWg1RbD8bwSn3LnFIoqBlk";
	private final String API_URL = "https://www.googleapis.com/youtube/v3/search"
									+"?key="+API_KEY
									+"&part=snippet&type=video&maxResults=20&videoEmbeddable=true";
	
	public List<Video> search(String keyword) throws Exception {
		URL url = new URL(API_URL + "&q="+URLEncoder.encode(keyword,"UTF-8"));
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while((inputLine = br.readLine()) != null) 
			response.append(inputLine);
		br.close();
		
		List<Video> videoList = new ArrayList<>();
		
		JSONParser parser = new JSONParser();
		JSONObject result = (JSONObject) parser.parse(response.toString());
		
		JSONArray items = (JSONArray) result.get("items");
		
		for (int i = 0; i < items.size(); i++) {
			JSONObject item = (JSONObject) items.get(i);
			Video video = parse(item);
			videoList.add(video);
		}
		return videoList;
	}
	
	public Video parse(JSONObject item) {
		String title = (String)((JSONObject)item.get("snippet")).get("title");
		String description = (String)((JSONObject)item.get("snippet")).get("description");
		String publishTime = (String)((JSONObject)item.get("snippet")).get("publishTime");
		String thumbnails = (String)((JSONObject)((JSONObject)((JSONObject)item.get("snippet")).get("thumbnails")).get("high")).get("url");
		String channelTitle = (String)((JSONObject)item.get("snippet")).get("channelTitle");
		String videoId = (String)((JSONObject)item.get("id")).get("videoId");
		
		Video video = new Video(title, description, publishTime, thumbnails, channelTitle, videoId);
		return video;
	}
}