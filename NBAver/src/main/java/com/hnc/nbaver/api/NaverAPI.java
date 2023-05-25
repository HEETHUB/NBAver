package com.hnc.nbaver.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.model.dto.News;

@Service
public class NaverAPI {
	private final String CLIENT_ID = "IdUhKYEyXmOXeFy1NFKt";
	private final String CLIENT_SECRET = "x8dJ64iwaM";
	private final String API_URL = "https://openapi.naver.com/v1/search/news.json?query=";
	
	public List<News> requestNews(String keyword) throws IOException{
		String searchURL = API_URL+URLEncoder.encode(keyword, "UTF-8")+"&sort=sim";
		
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("X-Naver-Client-Id", CLIENT_ID);
		requestHeaders.put("X-Naver-Client-Secret", CLIENT_SECRET);
		String responseBody = get(searchURL, requestHeaders);
		
		List<News> newsList = new ArrayList<>();
		
		try {
			JSONParser parser = new JSONParser();
			JSONObject result = (JSONObject) parser.parse(responseBody);
			
			JSONArray items = (JSONArray) result.get("items");
			
			for (int i = 0; i < items.size(); i++) {
				JSONObject item = (JSONObject) items.get(i);
				String title = (String)item.get("title");
				String originallink = (String) item.get("originallink");
				String link = (String) item.get("link");
				String description = (String) item.get("description");
				String pubDate = (String) item.get("pubDate");
				
				News temp = new News(title, originallink, link, description, pubDate);
				newsList.add(temp);
			}
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		} 
		return newsList;
	}

	private String get(String searchURL, Map<String, String> requestHeaders) {
		HttpURLConnection con = connect(searchURL);
		try {
			con.setRequestMethod("GET");
			for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
			}
			
			int responseCode = con.getResponseCode();
			// 정상 호출
			if (responseCode == HttpURLConnection.HTTP_OK) {
				return readBody(con.getInputStream());
			}
			// 오류 발생
			else {
				return readBody(con.getErrorStream());
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		} finally {
			con.disconnect();
		}
	}

	private HttpURLConnection connect(String searchURL) {
		try {
			URL url = new URL(searchURL);
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다. : " + searchURL, e);
		} catch (IOException e) {
			throw new RuntimeException("연결이 실패했습니다. : " + searchURL, e);
		}
	}
	
	private String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body);
		
		try (BufferedReader lineReader = new BufferedReader(streamReader)){
			StringBuilder responseBody = new StringBuilder();
			String line;
			while ((line = lineReader.readLine()) != null) {
				responseBody.append(line);
			}
			
			return responseBody.toString();
		} catch (Exception e) {
			throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
		}
	}
}
