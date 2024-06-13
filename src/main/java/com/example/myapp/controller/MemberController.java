package com.example.myapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.MemberDTO;
import com.example.myapp.service.JwtService;
import com.example.myapp.service.MemberService;

import io.jsonwebtoken.Claims;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberservice;
	 
	@Autowired
	JwtService jwtService;

	@PostMapping("/api/account/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> params,
							HttpServletResponse res) {
		MemberDTO member = memberservice.findByEmailAndPassword(params.get("email"), params.get("password"));

		if(member!=null){
			
			int id = member.getId();
			String token = jwtService.getToken("id", id);

			Cookie cookie = new Cookie("token", token);
			cookie.setHttpOnly(true);
			cookie.setPath("/");

			res.addCookie(cookie);

			return ResponseEntity.ok().body(id);

		}

		return ResponseEntity.ok().body(0);

	}
	
	@GetMapping("/api/account/check")
	public ResponseEntity<?> check(@CookieValue(value="token", required = false) String token) {

		Claims claims = jwtService.getClaims(token);

		if(claims!=null){

			int id = Integer.parseInt(claims.get("id").toString());

			return ResponseEntity.ok().body(id);
		}

		return ResponseEntity.ok().body(0);

	}
	
	
}