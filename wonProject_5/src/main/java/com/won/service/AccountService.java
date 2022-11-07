package com.won.service;

import java.util.List;

import com.won.VO.AccountVO;

public interface AccountService {

	// 가계부 내역
	public List<AccountVO> accounList(AccountVO account) throws Exception;

	// 가계부 내역 생성
	public void accountInsert(AccountVO account) throws Exception;

	// 가계부 내역 수정
	public int accountModify(AccountVO account) throws Exception;

	// 가계부 내역 삭제
	public int accountDelete(int ac_num);
}
