package com.won.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.won.model.GoalVO;
import com.won.service.GoalService;

@Controller
@RequestMapping("/goal/")
public class GoalController {

	private static final Logger logger = LoggerFactory.getLogger(GoalController.class);

	@Inject
	private GoalService goalService;

	// 목표 목록
	@RequestMapping(value = "/goalList", method = RequestMethod.GET)
	public void listGET(Model model) throws Exception {

		logger.info("목표 목록창 진입");

		List<GoalVO> goalList = null;
		goalList = goalService.goalList();

		model.addAttribute("goalList", goalList);
	}

	// 목표 등록 Get
	@RequestMapping(value = "/goalAdd", method = RequestMethod.GET)
	public void getAdd() throws Exception {

	}

	// 목표 등록 Post
	@RequestMapping(value = "/goalAdd", method = RequestMethod.POST)
	public String postAdd(GoalVO goal) throws Exception {

		goalService.goalInsert(goal);

		logger.info("목표 목록창 진입");

		return "redirect:/goal/goalList";

	}

	// 목표 상세 보기
	@RequestMapping(value = "/goalView", method = RequestMethod.GET)
	public void getView(@RequestParam("g_num") int g_num, Model model) throws Exception {
		logger.info("목표 상세창 진입");

		GoalVO goal = goalService.goalView(g_num);

		model.addAttribute("goalView", goal); // jsp에서 ${goalview.g_name} 형식으로 부르기
	}

	// 목표 수정
	@RequestMapping(value = "/goalModify", method = RequestMethod.GET)
	public void getMofidy(@RequestParam("g_num") int g_num, Model model) throws Exception {

		GoalVO goal = goalService.goalView(g_num);

		model.addAttribute("goalView", goal);

	}

	// 목표 수정
	@RequestMapping(value = "/goalModify", method = RequestMethod.POST)
	public String postMofidy(GoalVO goal) throws Exception {

		goalService.goalModify(goal);

		return "redirect:/goal/view?g_num=" + goal.getG_num();

	}

	// 목표 삭제
	@RequestMapping(value = "/goalDelete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("g_num") int g_num) throws Exception {

		goalService.goalDelete(g_num);

		return "redirect:/goal/goalList";
	}

}
