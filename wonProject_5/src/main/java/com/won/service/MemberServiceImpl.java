package com.won.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.won.dao.MemberDao;
import com.won.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDao memDAO;

	// 회원 가입
	@Override
	public void memberJoin(MemberVO memVO) throws Exception {

		memDAO.memberJoin(memVO);
		
	}

	// 로그인
	@Override
	public MemberVO memberLogin(MemberVO memVO) throws Exception {
		return memDAO.memberLogin(memVO);
	}

	// 로그아웃
	@Override
	public void memberLogout(HttpSession session) throws Exception {
		session.invalidate(); // 세션 데이터 삭제로 로그아웃
	}
	
}
