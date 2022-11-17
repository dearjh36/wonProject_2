package com.won.service;

import java.util.List;

import com.won.model.GoalVO;

public interface GoalService {

	// 목표 목록
	public List<GoalVO> goalList(String id) throws Exception;

	// 목표 생성
	public void goalInsert(GoalVO goalVO) throws Exception;

	// 목표 상세 페이지
	public GoalVO goalView(int g_num) throws Exception;

	// 목표 수정
	public void goalModify(GoalVO goalVO) throws Exception;

	// 목표 삭제
	public void goalDelete(int g_num) throws Exception;

	// 목표 개수
	public int goalCount(String id) throws Exception;

	// 모은 금액 변경
	public void currentAmountAdd(GoalVO goal) throws Exception;
}
