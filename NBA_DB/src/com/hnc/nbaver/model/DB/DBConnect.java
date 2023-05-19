package com.hnc.nbaver.model.DB;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	private static String URL = "jdbc:mysql://localhost:3306/nbadb?serverTimezone=UTC";
	private static String USERNAME = "root";
	private static String PASSWORD = "ssafy";
	private static Connection conn;
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("success");
			Statement stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<String[]> getFromNba_players() {
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
//                String NBAName = rs.getString(1);
//                String NBALink = rs.getString(2);
//                String NBAID = rs.getString(3);
//                String NBABirthDate = rs.getString(4);
//                System.out.println(NBAName+" "+NBALink+" "+NBAID);
                res.add(temp);
            }
        } catch (Exception e) {
            System.out.println("select 메서드 예외발생");
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
		// 쿼리문
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
				System.out.println(playerName+"의 "+stats[0]+"년도 데이터 삽입 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패..");
		}
	}
}
