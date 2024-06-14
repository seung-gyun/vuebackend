package com.example.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.myapp.dto.CartDTO;
import com.example.myapp.dto.ItemDTO;
import com.example.myapp.service.CartService;
import com.example.myapp.service.ItemService;
import com.example.myapp.service.JwtService;


@RestController
public class CartController {
	
	@Autowired
	JwtService jwtService;
	
	@Autowired
	CartService cartService;

	@Autowired
	ItemService itemService;

	@GetMapping("/api/cart/items")
	public ResponseEntity<List<ItemDTO>> getCartItems(@CookieValue(value="token", required=false)String token) {
		
		if(!jwtService.isValid(token)){
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED); // 401 코드 리턴!
		}

		int memberId = jwtService.getId(token);
		List<CartDTO> carts = cartService.findByMemberId(memberId);
		List<Integer> itemIds = carts.stream().map(CartDTO::getItemId).toList();
		List<ItemDTO> items = itemService.findByIdIn(itemIds);

		return new ResponseEntity<>(items, HttpStatus.OK);

	}
	

	@GetMapping("/api/cart/items/{itemId}")
	public ResponseEntity<Void> pushCartItem(@PathVariable("itemId") int itemId, @CookieValue(value="token", required=false)String token)
	{
	
		if(!jwtService.isValid(token)){
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED); // 401 코드 리턴!
		}

		int memberId = jwtService.getId(token);
		CartDTO cart = cartService.findByMemberIdAndItemId(memberId, itemId);

		if(cart == null){

			CartDTO newCart = new CartDTO();
			newCart.setMemberId(memberId);
			newCart.setItemId(itemId);
			cartService.cartSave(newCart);
		}

		return new ResponseEntity<>(HttpStatus.OK);

	}
}