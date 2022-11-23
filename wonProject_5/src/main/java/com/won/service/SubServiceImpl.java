package com.won.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.won.dao.SubDao;
import com.won.model.SubVO;

@Service
public class SubServiceImpl implements SubService{
	
	@Inject
	private SubDao subDao;

	// 구독자 목록
	@Override
	public List<SubVO> subList() throws Exception {
		return subDao.subList();
	}

	// 구독하기
	@Override
	public void subInsert(SubVO subVO) throws Exception {
		subDao.subInsert(subVO);
	}

	// 구독취소
	@Override
	public void subStop(SubVO subVO) throws Exception {
		subDao.subStop(subVO);
	}

	// 구독 내역 하나 가져오기
	@Override
	public SubVO subView(int s_num) throws Exception {
		return subDao.subView(s_num);
	}

	// 구독 연장하기
	@Override
	public void subExtend(SubVO subVO) throws Exception {
		subDao.subExtend(subVO);
	}

	// member 구독중인 정보 가져오기
	@Override
	public SubVO subMemberView(String id) {
		return subDao.subMemberView(id);
	}

}
