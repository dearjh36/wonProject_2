package com.won.dao;

import com.won.model.MemberVO;

public interface MemberDao {

	// 회원가입
	public void memberJoin(MemberVO memVO) throws Exception;

	// 로그인
	public MemberVO memberLogin(MemberVO memVO) throws Exception;

	// 멤버 구독 상태 변경 add
	public void memberSubAdd(String id);

	// 멤버 구독 상태 변경 stop
	public void memberSubStop(String id);
}
