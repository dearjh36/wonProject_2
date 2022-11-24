package com.won.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.won.model.MemberVO;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	private SqlSession sql;
	
	private static String namespace = "com.won.mapper.AdminMapper";

	// 회원 수 조회
	@Override
	public int memberCount() throws Exception {
		return sql.selectOne(namespace+".memberCount");
	}

	// 구독자 수 조회
	@Override
	public int subCount() throws Exception {
		return sql.selectOne(namespace+".subCount");
	}

	// 회원 리스트
	@Override
	public List<MemberVO> memberList() throws Exception {
		return sql.selectList(namespace+".memberList");
	}

	// 회원 코멘트 작성
	@Override
	public void memberState(MemberVO member) throws Exception {
		sql.update(namespace+".memberState", member);
	}

	// 회원 하나 고르기
	@Override
	public MemberVO memberOne(String id) throws Exception {
		return sql.selectOne(namespace+".memberOne",id);
	}

	@Override
	public List<MemberVO> memberSearch(String searchType, String keyword) throws Exception {

		  HashMap<String, Object> data = new HashMap<String, Object>();
		  
		  data.put("searchType", searchType);
		  data.put("keyword", keyword);
		  
		  return sql.selectList(namespace + ".memberSearch", data);
	}

/*	//회원 목록 총 갯수
	@Override
	public int pageCount() throws Exception {
		return sql.selectOne(namespace+".pageCount");
	}*/
	
	

}
