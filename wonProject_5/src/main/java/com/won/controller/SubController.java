package com.won.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.won.model.MemberVO;
import com.won.model.SubVO;
import com.won.service.MemberService;
import com.won.service.SubService;

@Controller
@RequestMapping("/sub/")
public class SubController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Inject
	private SubService subService;
	
	@Inject
	private MemberService memService;
	
	// 구독하기
	@RequestMapping(value="/subAdd",method = RequestMethod.GET)
	public void addSubGet() throws Exception{
		
	}
	
	// 구독하기
	@RequestMapping(value="/subAdd",method = RequestMethod.POST)
	public String addSubPost(SubVO sub, HttpSession session) throws Exception{
		
		logger.info("구독하기 진입");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		sub.setId(member.getId());
		
		Calendar cal = Calendar.getInstance();
		java.util.Date subDate = sub.getS_startDate ();
		
		cal.setTime(subDate);
		cal.add(Calendar.MONTH, 1);
	
		subDate = cal.getTime();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(subDate);
        
        
        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
		
		sub.setS_lastDate(date1);
		subService.subInsert(sub);
		
		memService.memberSubAdd(member.getId());
		
		return "redirect:/member/memInfo";
		
	}
	
	// 구독해지하기
	@RequestMapping(value="/subStop",method = RequestMethod.GET)
	public void stopSubGet() throws Exception{
				
	}
	
	// 구독해지하기
	@RequestMapping(value="/subStop",method = RequestMethod.POST)
	public String stopSubPost(HttpSession session) throws Exception{
		
		MemberVO member = (MemberVO)session.getAttribute("member");		
		String id = member.getId();
			
		SubVO sub = subService.subMemberView(id);
		
		subService.subStop(sub);
		memService.memberSubStop(id);
		
		return "redirect:/member/memInfo";
		
	}
	
}
