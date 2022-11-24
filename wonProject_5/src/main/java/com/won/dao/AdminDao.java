package com.won.dao;

import java.util.List;

import com.won.model.MemberVO;

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
	
/*	// 회원 목록 총 갯수
	public int pageCount() throws Exception;*/
	
	// 회원 검색
	public List<MemberVO> memberSearch(String searchType, String keyword) throws Exception;
	
}
