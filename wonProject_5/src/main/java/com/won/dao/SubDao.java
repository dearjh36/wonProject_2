package com.won.dao;

import java.util.List;

import com.won.model.SubVO;

public interface SubDao {
	
	// 구독자 목록 
	public List<SubVO> subList() throws Exception;	
	
	// 구독하기
	public void subInsert(SubVO subVO) throws Exception;
	
	// 구독 취소하기
	public void subStop(SubVO subVO) throws Exception;
	
	// 구독 내역 하나 가져오기
	public SubVO subView(int s_num) throws Exception;
	
	// 구독 연장하기
	public void subExtend(int s_num) throws Exception;
	
}
