package com.hnc.nbaver.model.DB;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	private static ChromeOptions options;
	private static WebDriver driver;
	private static Selenium instance = new Selenium();
	
	private Selenium() {
		options = new ChromeOptions();
		options.addArguments("--start-minimized");
		options.addArguments("--window-size=1,1");
		driver = new ChromeDriver(options);
	}
	
	public static Selenium getInstance() {
		return instance;
	}
	
	public void updatePlayerStat() {
		DBConnect db = DBConnect.getInstance();
		List<String[]> players = db.getFromNbaPlayers();
		
		int playerNum = players.size();
		
		for (int i = 0; i < playerNum; i++) {
			String playerName = players.get(i)[0];
			int playerId = Integer.parseInt(players.get(i)[2]);
			String url = "https://www.nba.com/stats/player/"+players.get(i)[2];
			try {
//				System.out.println("�� "+playerNum+"���� ���� �� "+(i+1)+"��° "+playerName+"�� ������ �޾ƿ��� ��");
				driver.get(url);
				WebElement table = driver.findElement(By.cssSelector("#__next > div.Layout_base__6IeUC.Layout_justNav__2H4H0 > div.Layout_mainContent__jXliI > section > div.MaxWidthContainer_mwc__ID5AG > section.Block_block__62M07.nba-stats-content-block > div > div.Crom_base__f0niE > div.Crom_container__C45Ti.crom-container > table > tbody"));
				String[] stat_arr = table.getText().split("\n");
				for (int idx = 0; idx < stat_arr.length; idx++) {
					String[] stat = stat_arr[idx].split(" ");
					db.updatePlayerStat(playerName, playerId, stat);
				}
			} catch (Exception e) {
				System.out.println(playerId+" "+playerName+" ������ ����");
			}
		}
		driver.quit();
	}
}
