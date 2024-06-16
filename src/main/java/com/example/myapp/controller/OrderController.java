package com.example.myapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.myapp.dto.OrderDTO;
import com.example.myapp.service.CartService;
import com.example.myapp.service.JwtService;
import com.example.myapp.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	JwtService jwtService;

	@Autowired
	OrderService orderService;

	@Autowired
	CartService cartService;

	@GetMapping("/api/orders")
	public ResponseEntity<?> getOrder(@CookieValue(value="token", required=false)String token)
	{

		if(!jwtService.isValid(token)){
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED); // 401 코드 리턴!
		}

		List<OrderDTO> orders = orderService.findAllOrder();
		
		return ResponseEntity.ok().body(orders);

	}

	@PostMapping("/api/orders")
	public ResponseEntity<Void> pushOrder(@RequestBody OrderDTO dto ,@CookieValue(value="token", required=false)String token)
	{
	
		if(!jwtService.isValid(token)){
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED); // 401 코드 리턴!
		}

		int memberId = jwtService.getId(token);
		OrderDTO orderDto = new OrderDTO();

		orderDto.setMemberId(memberId);
		orderDto.setName(dto.getName());
		orderDto.setAddress(dto.getAddress());
		orderDto.setPayment(dto.getPayment());
		orderDto.setCardnumber(dto.getCardnumber());
		orderDto.setItems(dto.getItems());

		orderService.orderSave(orderDto);
		cartService.cartDeleteAll(memberId);

		return new ResponseEntity<>(HttpStatus.OK);

	}


}