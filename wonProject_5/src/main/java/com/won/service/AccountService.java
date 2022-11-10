package com.won.service;

import java.util.List;

import com.won.model.AccountVO;

public interface AccountService {

	// 가계부 내역
	public List<AccountVO> accountList() throws Exception;

	// 가계부 내역 생성
	public void accountInsert(AccountVO account) throws Exception;
	
	// 가계부 내역 하나 고르기
	public AccountVO accountView(int ac_num) throws Exception;

	// 가계부 내역 수정
	public void accountModify(AccountVO account) throws Exception;

	// 가계부 내역 삭제
	public void accountDelete(int ac_num) throws Exception;
}
