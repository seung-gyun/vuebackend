package com.example.myapp.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dto.OrderDTO;
import com.example.myapp.mapper.OrderMapper;
import com.example.myapp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired(required =true)
	OrderMapper orderMapper;

    @Override
	public void orderSave(OrderDTO orderDto){
        orderMapper.orderSave(orderDto);
    }

    @Override
	public List<OrderDTO> findAllOrder(){

        return orderMapper.findAllOrder();

    }

}
