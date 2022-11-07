package com.won.mapper;

import java.util.List;

import com.won.VO.GoalVO;

public interface GoalMapper {
	
	// 목표 생성
	public void goalInsert(GoalVO goal);
	
	// 목표 목록
	public List<GoalVO> goalList(GoalVO goal);
	
	// 목표 상세 보기
	public GoalVO goalView(int g_num);
	
	// 목표 수정
	public int goalModify(GoalVO goal);
	
	
	
	// 금액 추가 
	public int currentAmountAdd(GoalVO goal);

	// 금액 삭제
	public int currentAmountDel(GoalVO goal);
	
	
	
	// 목표 삭제
	public int goalDelete(int g_num);

}
