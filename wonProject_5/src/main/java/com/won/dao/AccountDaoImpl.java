package com.won.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.won.model.AccountVO;

@Repository
public class AccountDaoImpl implements AccountDao{

	@Autowired
	private SqlSession sqlsession;
	
	private static String namespace = "com.won.mapper.AccountMapper";
	
	// 가계부 목록
	@Override
	public List<AccountVO> accountList(String id) throws Exception {
		
		return sqlsession.selectList(namespace+".accountList",id);
		
	}
	

	// 가계부 내역 생성
	@Override
	public void accountInsert(AccountVO account) throws Exception {

		sqlsession.insert(namespace + ".accountInsert", account);
		
	}

	// 가계부 내역 수정
	@Override
	public void accountModify(AccountVO account) throws Exception {
		
		sqlsession.update(namespace + ".accountModify", account);
		
	}

	// 가계부 내역 삭제
	@Override
	public void accountDelete(int ac_num) throws Exception {
		
		sqlsession.delete(namespace + ".accountDelete", ac_num);
		
	}

	// 목표 하나 고르기
	@Override
	public AccountVO accountView(int ac_num) throws Exception {
		
		return sqlsession.selectOne(namespace + ".accountView",ac_num);
		
	}

	// 목표 금액 내역
	@Override
	public List<AccountVO> goalAmountList(int ac_goalNum) {
		
		return sqlsession.selectList(namespace + ".goalAmountList", ac_goalNum);
		
	}
}
