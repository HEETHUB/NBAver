package com.hnc.nbaver.model.DB;

public class RunCrawl {
	private static JsoupService js = JsoupService.getInstance();
	private static Selenium sel = Selenium.getInstance();
	
	public static void main(String[] args) {
		js.updateTeamStat();
		sel.updatePlayerStat();
	}
}	