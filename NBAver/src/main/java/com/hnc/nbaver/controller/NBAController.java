package com.hnc.nbaver.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NBAController {

	@GetMapping("/")
	public String start(Model model) {
		model.addAttribute("msg", "start");
		return "start";
	}
}
