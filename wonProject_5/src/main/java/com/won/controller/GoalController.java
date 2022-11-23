package com.won.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.won.model.AccountVO;
import com.won.model.GoalVO;
import com.won.model.MemberVO;
import com.won.service.AccountService;
import com.won.service.GoalService;

@Controller
@RequestMapping("/goal/")
public class GoalController {

	private static final Logger logger = LoggerFactory.getLogger(GoalController.class);

	@Inject
	private GoalService goalService;
	
	@Inject
	private AccountService accService;

	// 목표 목록
	@RequestMapping(value = "/goalList", method = RequestMethod.GET)
	public void listGET(Model model, HttpSession session) throws Exception {

		logger.info("목표 목록창 진입");

		MemberVO member = (MemberVO)session.getAttribute("member");
		
		String id = member.getId();
		
		List<GoalVO> goalList = null;
		goalList = goalService.goalList(id);		
		
		for(int i = 0; i<goalList.size(); i++) {
			TimeSet ts = new TimeSet();
			int tsarr[] = ts.goalTime(goalList.get(i));
			model.addAttribute("goalWaitDay",tsarr[i]);
			model.addAttribute("goalPrecent",tsarr[i+1]);		
			
		}
		
		model.addAttribute("goalList", goalList);
		model.addAttribute("cnt",goalService.goalCount(id));
	}

	// 목표 등록 Get
	@RequestMapping(value = "/goalAdd", method = RequestMethod.GET)
	public void getAdd() throws Exception {

	}

	// 목표 등록 Post
	@RequestMapping(value = "/goalAdd", method = RequestMethod.POST)
	public String postAdd(GoalVO goalVO, HttpSession session) throws Exception {

		logger.info("목표 목록창 진입");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		goalVO.setId(member.getId());
		
		goalService.goalInsert(goalVO);

		return "redirect:/goal/goalList";

	}

	// 목표 상세 보기
	@RequestMapping(value = "/goalView", method = RequestMethod.GET, params = {"g_num"})
	public void getView(@RequestParam("g_num") int g_num, Model model) throws Exception {
		logger.info("목표 상세창 진입");

		GoalVO goal = goalService.goalView(g_num);
		
		
		List<AccountVO> accList = null;
		accList = accService.goalAmountList(g_num);
		
		TimeSet ts = new TimeSet();
		
		int tsarr[] = ts.goalTime(goal);

		model.addAttribute("goalView", goal);
		model.addAttribute("goalAmountList",accList);
		model.addAttribute("goalWaitDay",tsarr[0]);
		model.addAttribute("goalPrecent",tsarr[1]);		

	}

	// 목표 수정
	@RequestMapping(value = "/goalModify", method = RequestMethod.GET, params = {"g_num"})
	public void getMofidy(@RequestParam("g_num") int g_num, Model model) throws Exception {

		GoalVO goal = goalService.goalView(g_num);

		model.addAttribute("goalView", goal);

	}

	// 목표 수정
	@RequestMapping(value = "/goalModify", method = RequestMethod.POST)
	public String postMofidy(GoalVO goal) throws Exception {

		goalService.goalModify(goal);

		return "redirect:/goal/goalList";

	}

	// 목표 삭제
	@RequestMapping(value = "/goalDelete", method = RequestMethod.GET, params = {"g_num"})
	public String getDelete(@RequestParam("g_num") int g_num) throws Exception {

		goalService.goalDelete(g_num);

		return "redirect:/goal/goalList";
	}

}
