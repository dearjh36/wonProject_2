package com.won.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.won.VO.GoalVO;
import com.won.service.AccountService;
import com.won.service.GoalService;

@Controller
public class GoalController {

	private static final Logger logger = LoggerFactory.getLogger(GoalController.class);
	
	@Autowired
	private GoalService goalService;
	
	@Autowired
	private AccountService accountService;
	

	@GetMapping("/list")
	public String listGET() {
		logger.info("목표 목록창 진입");
		return "goalList";
	}
	
	@GetMapping("/add")
	public String addGET(GoalVO goal, RedirectAttributes rttr) throws Exception{
		logger.info("목표 등록창 진입");
		
		goalService.goalInsert(goal);
		
		rttr.addFlashAttribute("goalInser_result",goal.getG_name());
		
		return "goalAdd";
	}
	
	@GetMapping("/detail")
	public String detailGET() {
		logger.info("목표 상세창 진입");
		return "goalView";
	}

}
