package com.won.dao;

import java.util.List;

import com.won.model.AccountVO;

public interface AccountDao {
	
	// 가계부 내역
	public List<AccountVO> accountList(String id) throws Exception;
	
	// 목표 하나 고르기
	public AccountVO accountView(int ac_num) throws Exception;

	// 가계부 내역 생성
	public void accountInsert(AccountVO account) throws Exception;

	// 가계부 내역 수정
	public void accountModify(AccountVO account) throws Exception;

	// 가계부 내역 삭제
	public void accountDelete(int ac_num) throws Exception;
	
	// 목표 금액 내역
	public List<AccountVO> goalAmountList(int ac_goalNum);

}
