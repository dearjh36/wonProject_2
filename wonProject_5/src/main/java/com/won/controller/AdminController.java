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

import com.won.model.MemberVO;
import com.won.service.AdminService;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	private AdminService adminService;

	// 관리자 화면
	@RequestMapping(value ="/adminMain", method = RequestMethod.GET)
	public void getAdminMain(Model model) throws Exception {
		
		int memberCount = adminService.memberCount();
		int subCount = adminService.subCount();
		
		model.addAttribute("memberCount",memberCount);
		model.addAttribute("subCount",subCount);
		
		List<MemberVO> memList = adminService.memberList();
		
		model.addAttribute("memList",memList);
		
	}

	// 회원 검색
	@RequestMapping(value ="/memberSearch", method = RequestMethod.GET)
	public void postMemberSearch(@RequestParam(value="searchType", required=false,defaultValue="id") String searchType,@RequestParam(value="keyword", required=false,defaultValue="") String keyword, Model model) throws Exception {
		
		List<MemberVO> member = null;
		member = adminService.memberSearch(searchType, keyword);
		
		model.addAttribute("memberList",member);
	}
	
	// 회원 상세보기
	@RequestMapping(value ="/memberView", method = RequestMethod.GET)
	public void postMemberSearch(@RequestParam("id") String id, Model model) throws Exception {
		
		MemberVO member = null;
		member = adminService.memberOne(id);
		
		model.addAttribute("memberList",member);
	}

}
