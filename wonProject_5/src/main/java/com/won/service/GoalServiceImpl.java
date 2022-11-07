package com.won.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.won.VO.GoalVO;
import com.won.mapper.GoalMapper;

@Service
public class GoalServiceImpl implements GoalService{
	
	private static final Logger log = LoggerFactory.getLogger(GoalServiceImpl.class);
	
	@Autowired
	GoalMapper goalMapper;
	
	// 목표 등록
	@Override
	public void goalInsert(GoalVO goal) throws Exception{
		
		goalMapper.goalInsert(goal);
		
	}

	// 목표 목록
	@Override
	public List<GoalVO> goalList(GoalVO goal) throws Exception {
		
		log.info("(service)goalList()....." + goal);
		
		return goalMapper.goalList(goal);
	
	}

	// 목표 상세 페이지 
	@Override
	public GoalVO goalView(int g_num) throws Exception {
		
		log.info("goalView....." + g_num);
		
		return goalMapper.goalView(g_num);
	}

	// 목표 수정
	@Override
	public int goalModify(GoalVO goal) throws Exception {
		
		log.info("(service)goalModify()....." + goal);

		return goalMapper.goalModify(goal);
	}
	
	// 목표 삭제
	@Override
	public int goalDelete(int g_num) {

		log.info("goalDelete..........");
		
		return goalMapper.goalDelete(g_num);
	}
	
	
}
