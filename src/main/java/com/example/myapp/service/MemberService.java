package com.example.myapp.service;

import com.example.myapp.dto.MemberDTO;

public interface MemberService {

	public MemberDTO findByEmailAndPassword(String email, String password);
	
} 