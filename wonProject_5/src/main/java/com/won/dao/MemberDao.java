package com.won.dao;

import com.won.model.MemberVO;

public interface MemberDao {

	// 회원가입
	public void memberJoin(MemberVO memVO) throws Exception;
	
	// 로그인
	public MemberVO memberLogin(MemberVO memVO) throws Exception;
	
}
