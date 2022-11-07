package com.won.mapper;

import java.util.List;

import com.won.VO.AccountVO;

public interface AccountMapper {

	// 가계부 내역
	public List<AccountVO> accounList(AccountVO account);
	
	// 가계부 내역 생성
	public void accountInsert(AccountVO account);
	
	// 가계부 내역 수정
	public int accountModify(AccountVO account);
	
	// 가계부 내역 삭제
	public int accountDelete(int ac_num);
}
