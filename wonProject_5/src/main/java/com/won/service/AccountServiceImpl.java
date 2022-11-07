package com.won.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.won.VO.AccountVO;
import com.won.mapper.AccountMapper;

public class AccountServiceImpl implements AccountService {

	private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Autowired
	AccountMapper accountMapper;

	@Override
	public List<AccountVO> accounList(AccountVO account) throws Exception {
		log.info("(service)goalList()....." + account);

		return accountMapper.accounList(account);
	}

	@Override
	public void accountInsert(AccountVO account) throws Exception {
		accountMapper.accountInsert(account);

	}

	@Override
	public int accountModify(AccountVO account) throws Exception {
		log.info("(service)accountModify()....." + account);

		return accountMapper.accountModify(account);
	}

	@Override
	public int accountDelete(int ac_num) {
		log.info("accountDelete..........");

		return accountMapper.accountDelete(ac_num);
	}



}
