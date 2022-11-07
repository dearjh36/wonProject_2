package com.won.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BankController {
	
	private static final Logger logger = LoggerFactory.getLogger(BankController.class);
	
	@GetMapping("/l_main")
	public String mainGET() {
		logger.info("가계부 메인창 진입");
		return "accMain";
	}
	
	@GetMapping("/change")
	public String changeGET() {
		logger.info("추가/삭제창 진입");
		return "accAdd";
	}
}
