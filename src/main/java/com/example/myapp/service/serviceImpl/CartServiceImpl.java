package com.example.myapp.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dto.CartDTO;
import com.example.myapp.mapper.CartMapper;
import com.example.myapp.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired(required =true)
	CartMapper cartMapper;

	@Override
	public List<CartDTO> findByMemberId(int memberId){

		List<CartDTO> cartList = cartMapper.findByMemberId(memberId);
			
		return cartList;

	}

	@Override
	public CartDTO findByMemberIdAndItemId(int memberId, int itemId){

		CartDTO cart = cartMapper.findByMemberIdAndItemId(memberId, itemId);

		return cart;

	}

	@Override
	public void cartSave(CartDTO cartdto){

		cartMapper.cartSave(cartdto);

	}
	
	@Override
	public void cartDelete(CartDTO cartdto){

		cartMapper.cartDelete(cartdto);

	}

	@Override
	public void cartDeleteAll(int memberId){

		cartMapper.cartDeleteAll(memberId);

	}

}
