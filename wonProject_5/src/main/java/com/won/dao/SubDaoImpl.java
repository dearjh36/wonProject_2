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
	
	// 
	@Override
	public List<SubVO> subList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void subInsert(SubVO subVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subStop(SubVO subVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SubVO subView(int s_num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void subExtend(int s_num) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
