package com.won.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.won.dao.AdminDao;
import com.won.dao.MemberDao;
import com.won.dao.SubDao;
import com.won.model.MemberVO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Inject
	private AdminDao admin;
	
	// 회원 수 조회
	@Override
	public int memberCount() throws Exception {
		return admin.memberCount();
	}

	// 구독자 수 조회
	@Override
	public int subCount() throws Exception {
		return admin.subCount();
	}

	// 회원 리스트
	@Override
	public List<MemberVO> memberList() throws Exception {
		
		List<MemberVO> result = admin.memberList();
		
		return result;
	}

	// 회원 코멘트 작성
	@Override
	public void memberState(MemberVO member) throws Exception {
		admin.memberState(member);
	}

	// 회원 하나 고르기
	@Override
	public MemberVO memberOne(String id) throws Exception {
		return admin.memberOne(id);
	}
	
}
