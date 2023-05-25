package com.hnc.nbaver.model.DB;

import java.util.*;

import com.hnc.nbaver.model.dto.Match;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	private static String URL = "jdbc:mysql://localhost:3306/nbadb?serverTimezone=UTC";
	private static String USERNAME = "nba";
	private static String PASSWORD = "nba";
	
	private static Connection conn;
	private static JsoupService js = JsoupService.getInstance();
	
	// make Singleton 
	private static DBConnect instance = new DBConnect();
	private DBConnect() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static DBConnect getInstance() {
		return instance;
	}
	
	public List<String[]> getFromNbaPlayers() {
		List<String[]> res = new ArrayList<>();
		
		String sql = "select * from nba_players";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int idx = 0;
            while (rs.next() && idx < 100) {
            	String[] temp = new String[4];
            	for (int i = 1; i <= 4; i++)
            		temp[i-1] = rs.getString(i);
                res.add(temp);
            }
        } catch (Exception e) {
            System.out.println("select �޼��� ���ܹ߻�");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
        return res;
	}
	
	public void updatePlayerStat(String playerName, int playerId, String[] stats) {
		// ������
		String sql = "insert into stat values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, playerId);
			pstmt.setString(2, playerName);
			pstmt.setString(3, stats[0]);
			pstmt.setString(4, stats[1]);
			pstmt.setInt(5, Integer.parseInt(stats[2]));
			for (int i = 3; i < 23; i++)
				pstmt.setDouble(i+3, Double.parseDouble(stats[i]));
			pstmt.setInt(26, Integer.parseInt(stats[23]));
			pstmt.setInt(27, Integer.parseInt(stats[24]));
			pstmt.setDouble(28, Double.parseDouble(stats[25]));
			
			int result = pstmt.executeUpdate();
			if (result == 1)
				System.out.println(playerName+"�� "+stats[0]+"�⵵ ������ ���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����..");
		}
	}
	
	public void updateTeamStat(String conf, String[] stats) {
		String sql = "insert into team_stat values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			String SNAME = js.getShortTeamName(stats[1]);
			String CONF = conf;
			pstmt.setString(1, SNAME);
			pstmt.setString(2, CONF);
			pstmt.setInt(3, Integer.parseInt(stats[0]));
			pstmt.setString(4, stats[1]);
			pstmt.setString(5, stats[2]);
			pstmt.setInt(6, Integer.parseInt(stats[3]));
			pstmt.setInt(7, Integer.parseInt(stats[4]));
			pstmt.setInt(8, Integer.parseInt(stats[5]));
			pstmt.setDouble(9, Double.parseDouble(stats[6]));
			pstmt.setDouble(10, Double.parseDouble(stats[7]));
			pstmt.setInt(11, Integer.parseInt(stats[8]));
			pstmt.setInt(12, Integer.parseInt(stats[9]));
			pstmt.setInt(13, Integer.parseInt(stats[10]));
			pstmt.setInt(14, Integer.parseInt(stats[11]));
			pstmt.setInt(15, Integer.parseInt(stats[12]));
			pstmt.setInt(16, Integer.parseInt(stats[13]));
			pstmt.setString(17, stats[14]);
			
			int result = pstmt.executeUpdate();
			if (result == 1)
				System.out.println(SNAME+" 데이터 입력 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 입력 실패");
		}
	}
	
	public void insertMatchSchedule(Match match) {
		String sql = "INSERT INTO game_schedule VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, match.getMonth());
			pstmt.setInt(2, match.getDay());
			pstmt.setString(3, match.getDow());
			pstmt.setString(4, match.getHour());
			pstmt.setString(5, match.getTeamLeft());
			pstmt.setString(6, match.getTeamRight());
			pstmt.setString(7, match.getScore());
			
			int result = pstmt.executeUpdate();
			if (result == 1)
				System.out.println(match.getMonth()+"."+match.getDay()+"자 데이터 입력 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("데이터 입력 실패 ㅠㅠ", e);
		}
	}
}
