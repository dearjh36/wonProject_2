package com.won.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.won.model.MemberVO;
import com.won.model.SubVO;
import com.won.service.MemberService;
import com.won.service.SubService;

@Controller
@RequestMapping("/member/")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService memService;

	@Inject
	private SubService subService;

	// 회원가입 GET
	@RequestMapping(value = "/memJoin", method = RequestMethod.GET)
	public void getJoin() throws Exception {
		logger.info("get 회원가입");
	}

	// 회원가입 POST
	@RequestMapping(value = "/memJoin", method = RequestMethod.POST)
	public String postJoin(MemberVO memVO) throws Exception {
		logger.info("post 회원가입");

		memService.memberJoin(memVO);
		logger.info(memVO.toString());
		return "redirect:/member/memLogin";
	}

	// 로그인 GET
	@RequestMapping(value = "/memLogin", method = RequestMethod.GET)
	public void getLogin() throws Exception {
		logger.info("get 로그인");
	}

	// 로그인 POST
	@RequestMapping(value = "/memLogin", method = RequestMethod.POST)
	public String postLogin(MemberVO memVO, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		logger.info("get 로그인");

		MemberVO login = memService.memberLogin(memVO);
		HttpSession session = req.getSession();

		if (login != null) {
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
	public String Logout(HttpSession session) throws Exception {

		logger.info("get 로그아웃");

		memService.memberLogout(session);

		return "redirect:/";

	}

	// 내 정보
	@RequestMapping(value = "/memInfo", method = RequestMethod.GET)
	public void Info(HttpSession session, Model model) throws Exception {
		

		MemberVO member = (MemberVO)session.getAttribute("member");
		String id = member.getId();
		
		
		if(member.getM_sub() != "0") {
		
		SubVO sub = subService.subMemberView(id);
		if(sub != null) {
			
		Calendar cal = Calendar.getInstance();
		Date subDate = sub.getS_lastDate();
		
		cal.setTime(subDate);
		cal.add(Calendar.DATE, 1);
		
		subDate = cal.getTime();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(subDate);
        
        logger.info(formattedDate);
		
		model.addAttribute("sub",sub);
		model.addAttribute("payDay",formattedDate);
		}
		}
		model.addAttribute("member", member);

	}

}
