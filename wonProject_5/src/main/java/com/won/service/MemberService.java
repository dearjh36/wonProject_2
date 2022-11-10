package com.won.service;

import javax.servlet.http.HttpSession;

import com.won.model.MemberVO;

public interface MemberService {
	
	// 회원 가입
	public void memberJoin(MemberVO memVO) throws Exception;
	
	// 로그인
	public MemberVO memberLogin(MemberVO memVO) throws Exception;
	
	// 로그아웃
	public void memberLogout(HttpSession session) throws Exception;
	
}
