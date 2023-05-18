package com.hnc.nbaver.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrawlController {
	@GetMapping("craw/pStat/{playerName}")
	@ResponseBody
	public void getStat(@PathVariable("playerName") String playerName) {
		
	}
}	
