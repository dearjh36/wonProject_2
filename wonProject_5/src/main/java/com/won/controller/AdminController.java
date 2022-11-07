package com.won.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);


	@GetMapping("/ad_main")
	public String ad_mainGET() {
		logger.info("관리자 메인창 진입");
		return "adminMain";
		
	}
	
	@GetMapping("/memberSearch")
	public String memberSearchGET() {
		logger.info("회원조회창 진입");
		return "admemberFind";
	}

	@GetMapping("/memberDetail")
	public String memberDetailGET() {
		logger.info("회원 상세창 진입");
		return "admemberDetail";
	}
}
