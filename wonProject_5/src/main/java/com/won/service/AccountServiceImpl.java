package com.won.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.won.dao.AccountDao;
import com.won.model.AccountVO;

@Service
public class AccountServiceImpl implements AccountService {

	private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Inject
	private AccountDao accDao;

	// 가계부 내역 목록
	@Override
	public List<AccountVO> accountList() throws Exception {

		log.info("(service)accList().....");

		return accDao.accountList();
	}

	// 가계부 내역 등록
	@Override
	public void accountInsert(AccountVO account) throws Exception {

		log.info("accountInsert().....");

		accDao.accountInsert(account);

	}

	// 가계부 내역 수정
	@Override
	public void accountModify(AccountVO account) throws Exception {

		log.info("accountModify().....");

		accDao.accountModify(account);

	}

	// 가계부 내역 삭제
	@Override
	public void accountDelete(int ac_num) throws Exception {

		log.info("accountDelete().....");

		accDao.accountDelete(ac_num);

	}

	// 가계부 내역 하나 고르기
	@Override
	public AccountVO accountView(int ac_num) throws Exception {

		return accDao.accountView(ac_num);
		
	}

}
