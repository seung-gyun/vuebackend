package com.example.myapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.MemberDTO;
import com.example.myapp.service.MemberService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberservice;
	 
	@PostMapping("/api/account/login")
	public int login(@RequestBody Map<String, String> params) {
		MemberDTO member = memberservice.findByEmailAndPassword(params.get("email"), params.get("password"));

		if(member!=null){
			return member.getId();
		}

		return 0;

	}
	
	
}