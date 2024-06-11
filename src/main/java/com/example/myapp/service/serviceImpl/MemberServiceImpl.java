package com.example.myapp.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dto.MemberDTO;
import com.example.myapp.mapper.MemberMapper;
import com.example.myapp.service.MemberService;


@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
	MemberMapper memberMapper;
	
	public MemberDTO findByEmailAndPassword(String email, String password) {
		return memberMapper.findByEmailAndPassword(email, password);
	}

}
