package com.hnc.nbaver.model.DB;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupService {
	private static JsoupService instance = new JsoupService();
	
	private JsoupService() {}
	
	public static JsoupService getInstance() {
		return instance;
	}
	
	public void updateTeamStat() {
		DBConnect db = DBConnect.getInstance();
		String url_east = "https://sports.news.naver.com/basketball/record/index?category=nba&year=2023&conference=EAST";
		String url_west = "https://sports.news.naver.com/basketball/record/index?category=nba&year=2023&conference=WEST";
		
		try {
			// east conf
			Connection conn_east = Jsoup.connect(url_east);
			Document doc_east = conn_east.get();
			Elements ele_east = doc_east.select("#regularTeamRecordList_table > tr");
			for (Element e : ele_east) {
				String conf = "EAST";
				String[] stats = e.text().split(" ");
				db.updateTeamStat(conf, stats);
			}
			
			// west conf
			Connection conn_west = Jsoup.connect(url_west);
			Document doc_west = conn_west.get();
			Elements ele_west = doc_west.select("#regularTeamRecordList_table > tr");
			for (Element e : ele_west) {
				String conf = "WEST";
				String[] stats = e.text().split(" ");
				db.updateTeamStat(conf, stats);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getShortTeamName(String name) {
		switch (name) {
		case "밀워키":
			return "MIL";
		case "보스턴":
			return "BOS";
		case "필라델피아":
			return "PHI";
		case "클리블랜드":
			return "CLE";
		case "뉴욕":
			return "NYK";
		case "브루클린":
			return "BKN";
		case "애틀랜타":
			return "ATL";
		case "마이애미":
			return "MIA";
		case "토론토":
			return "TOR";
		case "시카고":
			return "CHI";
		case "인디애나":
			return "IND";
		case "워싱턴":
			return "WAS";
		case "올랜도":
			return "ORL";
		case "샬럿":
			return "CHA";
		case "디트로이트":
			return "DET";
		case "덴버":
			return "DEN";
		case "멤피스":
			return "MEM";
		case "새크라멘토":
			return "SAC";
		case "피닉스":
			return "PHX";
		case "LAC":
			return "LAC";
		case "골든스테이트":
			return "GSW";
		case "LAL":
			return "LAL";
		case "미네소타":
			return "MIN";
		case "뉴올리언스":
			return "NOP";
		case "오클라호마시티":
			return "OKC";
		case "댈러스":
			return "DAL";
		case "유타":
			return "UTA";
		case "포틀랜드":
			return "POR";
		case "휴스턴":
			return "HOU";
		case "샌안토니오":
			return "SAS";
		default:
			break;
		}
		return null;
	}
}
