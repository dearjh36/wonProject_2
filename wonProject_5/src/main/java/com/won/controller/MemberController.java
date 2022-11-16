package com.won.controller;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.won.model.MemberVO;
import com.won.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService memService;
	
	// 회원가입 GET
	@RequestMapping(value="/memJoin", method = RequestMethod.GET)
	public void getJoin() throws Exception{
		logger.info("get 회원가입");
	}
	
	// 회원가입 POST
	@RequestMapping(value = "/memJoin",method = RequestMethod.POST)
	public String postJoin(MemberVO memVO) throws Exception{
		logger.info("post 회원가입");
		
		memService.memberJoin(memVO);
		
		return "redirect:/member/memLogin";
	}
	
	// 로그인 GET
	@RequestMapping(value = "/memLogin", method = RequestMethod.GET)
	public void getLogin() throws Exception{
		logger.info("get 로그인");
	}

	// 로그인 POST
	@RequestMapping(value = "/memLogin", method = RequestMethod.POST)
	public String postLogin(MemberVO memVO, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("get 로그인");
		
		MemberVO login = memService.memberLogin(memVO);
		HttpSession session = req.getSession();
			
		if(login != null) {
			session.setAttribute("member", login);
		} else {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/memLogin";
		}
		
		return "redirect:/account/accMain";
	}
	
	// 로그아웃
	@RequestMapping(value = "/memLogout", method = RequestMethod.GET)
	public String Logout(HttpSession session) throws Exception{
		
		logger.info("get 로그아웃");
		
		memService.memberLogout(session);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/내정보")
	public String myGET() {
		logger.info("내 정보 창 진입");
		return "";
	}
	

}
