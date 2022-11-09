package com.won.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.won.VO.GoalVO;

@Repository
public class GoalDaoImpl implements GoalDao{
	
	@Autowired
	private SqlSession sqlsession;
	
	private static String namespace = "com.won.mapper.GoalMapper";

	// 목표 목록
	@Override
	public List<GoalVO> goalList() throws Exception {
		
		return sqlsession.selectList(namespace+".goalList");
		
	}

	// 목표 상세 보기
	@Override
	public GoalVO goalView(int g_num) throws Exception {
		
		return sqlsession.selectOne(namespace + ".goalView", g_num);

	}

	// 목표 생성
	@Override
	public void goalInsert(GoalVO goal) throws Exception {
		
		sqlsession.insert(namespace + ".goalInsert", goal);
		
	}

	// 목표 수정
	@Override
	public void goalModify(GoalVO goal) throws Exception {

		sqlsession.update(namespace + ".goalModify", goal);
		
	}

	// 목표 삭제
	@Override
	public void goalDelete(int g_num) throws Exception {

		sqlsession.delete(namespace + ".goalDelete", g_num);
	
	}
	
}
