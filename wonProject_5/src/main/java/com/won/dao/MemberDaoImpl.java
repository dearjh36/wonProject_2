package com.won.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.won.model.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Inject
	private SqlSession sqlsession;
	
	private static String namespace = "com.won.mapper.MemberMapper";

	// 회원 가입
	@Override
	public void memberJoin(MemberVO memVO) throws Exception {
		sqlsession.insert(namespace + ".memberJoin",memVO);
	}

	// 로그인
	@Override
	public MemberVO memberLogin(MemberVO memVO) throws Exception {
		return sqlsession.selectOne(namespace + ".memberLogin", memVO);		
	}

	// 멤버 구독 상태 변경 add
	@Override
	public void memberSubAdd(String id) {
		sqlsession.update(namespace + ".memberSubAdd", id);
	}

	@Override
	public void memberSubStop(String id) {
		sqlsession.update(namespace + ".memberSubStop", id);
		
	}

}
