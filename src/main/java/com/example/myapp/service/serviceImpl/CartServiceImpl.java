package com.example.myapp.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dto.CartDTO;
import com.example.myapp.mapper.ItemMapper;
import com.example.myapp.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired(required =true)
	ItemMapper CartDTO;

	@Override
	public List<CartDTO> findByMemberId(int memberId){

		return null;

	}

}
