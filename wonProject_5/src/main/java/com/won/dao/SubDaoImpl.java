package com.won.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.won.model.SubVO;

@Repository
public class SubDaoImpl implements SubDao{
	
	@Autowired
	private SqlSession sqlsession;
	
	private static String namespace = "com.won.mapper.SubMapper";
	
	// 구독자 목록
	@Override
	public List<SubVO> subList() throws Exception {
		return sqlsession.selectList(namespace + ".subList");
	}

	// 구독하기
	@Override
	public void subInsert(SubVO subVO) throws Exception {
		sqlsession.insert(namespace + ".subInsert", subVO);
	}

	// 구독 취소
	@Override
	public void subStop(SubVO subVO) throws Exception {
		sqlsession.update(namespace + ".subStop", subVO);
	}

	// 구독 내역 하나 가져오기
	@Override
	public SubVO subView(int s_num) throws Exception {
		return sqlsession.selectOne(namespace+".subView", s_num);
	}

	// 구독 
	@Override
	public void subExtend(SubVO subVO) throws Exception {
		sqlsession.update(namespace + ".subExtend", subVO);
	}

	//member 구독중인 정보 가져오기
	@Override
	public SubVO subMemberView(String id) {
		return sqlsession.selectOne(namespace+".subMemberView", id);
	}

}
