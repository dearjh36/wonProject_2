package com.won.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoalController {

	private static final Logger logger = LoggerFactory.getLogger(GoalController.class);

	@GetMapping("/list")
	public String listGET() {
		logger.info("목표 목록창 진입");
		return "goalList";
	}
	
	@GetMapping("/add")
	public String addGET() {
		logger.info("목표 등록창 진입");
		return "goalAdd";
	}
	
	@GetMapping("/detail")
	public String detailGET() {
		logger.info("목표 상세창 진입");
		return "goalView";
	}

}
