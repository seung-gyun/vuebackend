package com.example.myapp.service;

import java.util.List;

import com.example.myapp.dto.OrderDTO;

public interface OrderService {

	public void orderSave(OrderDTO orderDto);
	public List<OrderDTO> findAllOrder();
} 