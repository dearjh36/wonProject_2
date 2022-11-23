package com.won.dao;

import java.util.List;

import com.won.model.MemberVO;
import com.won.model.SubVO;

public interface AdminDao {
	
	// 회원 수 조회
	public int memberCount() throws Exception;
	
	// 구독자 수 조회
	public int subCount() throws Exception;
	
	// 회원 리스트
	public List<MemberVO> memberList() throws Exception;
	
	// 회원 코멘트 작성
	public void memberState(MemberVO member) throws Exception;
	
	// 회원 하나 고르기
	public MemberVO memberOne(String id) throws Exception;
	
}
