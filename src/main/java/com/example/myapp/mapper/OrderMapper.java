package com.example.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.dto.OrderDTO;

@Mapper
public interface OrderMapper {

	public void orderSave(OrderDTO orderDto);
	public List<OrderDTO> findAllOrder();

}