package com.won.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	// 관리자 화면
	@RequestMapping(value ="/adminMain", method = RequestMethod.GET)
	public void getAdminMain() throws Exception {
		logger.info("get adminMain");
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
