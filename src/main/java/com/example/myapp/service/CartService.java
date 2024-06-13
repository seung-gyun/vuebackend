package com.example.myapp.service;

import java.util.List;

import com.example.myapp.dto.CartDTO;

public interface CartService {
	
    public List<CartDTO> findByMemberId(int memberId);

} 