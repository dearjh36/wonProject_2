package com.won.service;

import java.util.List;

import com.won.model.GoalVO;

public interface GoalService {
	
	// 목표 목록
	public List<GoalVO> goalList() throws Exception;
	
	// 목표 생성 
	public void goalInsert(GoalVO goal) throws Exception;
	
	// 목표 상세 페이지
	public GoalVO goalView(int g_num) throws Exception;
	
	// 목표 수정
	public void goalModify(GoalVO goal) throws Exception;
	
	// 목표 삭제
	public void goalDelete(int g_num) throws Exception;
}
