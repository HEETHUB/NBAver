package com.hnc.nbaver.controller;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
@RequestMapping("api/selenium/")
public class selenium {
	private WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/chromedriver");
		driver = new ChromeDriver();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	@GetMapping("sel")
	public void test_title() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/chromedriver");
		driver = new ChromeDriver();
		
		List<String> list = new ArrayList<>();
		
		driver.get("https://www.naver.com/");
		Thread.sleep(1000);
		
		WebElement sportsBtn = driver.findElement(By.cssSelector("#root > div.Layout-module__column_left___tLO23 > div:nth-child(2) > div.ContentHeaderView-module__content_header___nSgPg > div > ul > li:nth-child(3) > a"));
		sportsBtn.click();
		
	}
}
