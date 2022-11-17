package com.won.controller;

import java.util.List;

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
@RequestMapping("/account/")
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Inject
	private GoalService goalService;
	
	@Inject
	private AccountService accService;

	// 가계부 내역 목록
	@RequestMapping(value = "/accMain", method = RequestMethod.GET)
	public void listGET(HttpSession session, Model model) throws Exception {

		logger.info("가계부 내역 목록창 진입");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		String id = member.getId();

		List<AccountVO> accList = null;
		accList = accService.accountList(id);
		logger.info(id);
		logger.info(accList.toString());
		
		model.addAttribute("accList", accList);
		
	}

	// 가계부 내역 등록 Get
	@RequestMapping(value = "/accAdd", method = RequestMethod.GET)
	public void getAdd(HttpSession session, Model model) throws Exception {
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		String id = member.getId();
		
		List<GoalVO> goalList = null;
		goalList = goalService.goalList(id);
		
		model.addAttribute("goalList", goalList);		
		model.addAttribute("cnt",goalService.goalCount(id));
		
	}

	// 가계부 내역 등록 POST
	@RequestMapping(value = "/accAdd", method = RequestMethod.POST)
	public String postAdd(AccountVO accVO, HttpSession session) throws Exception {

		logger.info("가계부 내역 목록 등록창 진입");

		MemberVO member = (MemberVO)session.getAttribute("member");
		accVO.setId(member.getId());
		
		logger.info(accVO.toString());
		
		accService.accountInsert(accVO);

		return "redirect:/account/accMain";
	}

	// 가계부 내역 수정
	@RequestMapping(value = "/accModify", method = RequestMethod.GET,params = {"ac_num"})
	public void getMofidy(@RequestParam("ac_num") int ac_num, Model model) throws Exception {

		String num = Integer.toString(ac_num);
		
		logger.info(num);
		
		AccountVO accVO = accService.accountView(ac_num);
		logger.info(accVO.toString());

		model.addAttribute("accView", accVO);

	}
	
	// 가계부 내역 수정
	@RequestMapping(value = "/accModify", method = RequestMethod.POST)
	public String postMofidy(AccountVO accVO) throws Exception {

		accService.accountModify(accVO);
		logger.info("수정Post"+accVO.toString());
		
		return "redirect:/account/accMain";

	}
	
	// 가계부 내역 삭제
	@RequestMapping(value = "/accDelete", method = RequestMethod.GET,params = {"ac_num"})
	public String getDelete(@RequestParam("ac_num") int ac_num) throws Exception {

		accService.accountDelete(ac_num);

		return "redirect:/account/accMain";
	}
}
