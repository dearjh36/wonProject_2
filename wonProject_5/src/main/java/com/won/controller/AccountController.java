package com.won.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.won.dao.AccountDao;
import com.won.model.AccountVO;
import com.won.model.GoalVO;
import com.won.service.AccountService;

@Controller
@RequestMapping("/account/")
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Inject
	private AccountService accService;

	// 가계부 내역 목록
	@RequestMapping(value = "/accMain", method = RequestMethod.GET)
	public void listGET(Model model) throws Exception {

		logger.info("가계부 내역 목록창 진입");

		List<AccountVO> accList = null;
		accList = accService.accountList();

		model.addAttribute("accList", accList);
	}

	// 가계부 내역 등록 Get
	@RequestMapping(value = "/accAdd", method = RequestMethod.GET)
	public void getAdd() throws Exception {

	}

	// 가계부 내역 등록 POST
	@RequestMapping(value = "/accAdd", method = RequestMethod.POST)
	public String postAdd(AccountVO accVO) throws Exception {

		logger.info("가계부 내역 목록창 진입");

		accService.accountInsert(accVO);

		return "redirect:/account/accMain";
	}

	// 가계부 내역 수정
	@RequestMapping(value = "/accModify", method = RequestMethod.GET)
	public void getMofidy(@RequestParam("ac_num") int ac_num, Model model) throws Exception {

		AccountVO accVO = accService.accountView(ac_num);

		model.addAttribute("accView", accVO);

	}
	
	// 가계부 내역 수정
	@RequestMapping(value = "/accModify", method = RequestMethod.POST)
	public String postMofidy(AccountVO accVO) throws Exception {

		accService.accountModify(accVO);

		return "redirect:/account/accMain";

	}

	// 가계부 내역 삭제
	@RequestMapping(value = "/accDelete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("ac_num") int ac_num) throws Exception {

		accService.accountDelete(ac_num);

		return "redirect:/account/accMain";
	}
}
