package com.won.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.won.dao.GoalDao;
import com.won.model.GoalVO;

@Service
public class GoalServiceImpl implements GoalService{
	
	private static final Logger log = LoggerFactory.getLogger(GoalServiceImpl.class);
	
	@Inject
	private GoalDao goalDao;
	
	// 목표 목록
	@Override
	public List<GoalVO> goalList() throws Exception {
		
		log.info("(service)goalList().....");
		
		return goalDao.goalList();
		
	}
	
	
	// 목표 등록
	@Override
	public void goalInsert(GoalVO goal) throws Exception{
		
		goalDao.goalInsert(goal);
		
	}

	// 목표 상세 페이지 
	@Override
	public GoalVO goalView(int g_num) throws Exception {
		
		log.info("goalView....." + g_num);
		
		return goalDao.goalView(g_num);
	}

	// 목표 수정
	@Override
	public void goalModify(GoalVO goal) throws Exception {
		
		log.info("(service)goalModify()....." + goal);
		
		goalDao.goalModify(goal);
		
	}
	
	// 목표 삭제
	@Override
	public void goalDelete(int g_num) throws Exception {

		log.info("goalDelete..........");
		
		goalDao.goalDelete(g_num);
		
	}
	
	
}
