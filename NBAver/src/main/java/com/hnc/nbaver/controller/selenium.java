package com.hnc.nbaver.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selenium {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--proxy-server=http://your-proxy-host:your-proxy-port");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	}
}
