package com.example.myapp.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dto.ItemDTO;
import com.example.myapp.mapper.ItemMapper;
import com.example.myapp.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired(required =true)
	ItemMapper itemMapper;

	public List<ItemDTO> selectAll() {
		
		try {
			
			return itemMapper.selectAll();

		} catch (Exception e) {
			
			throw new RuntimeException();
			
		}

		
	}

	public List<ItemDTO> findByIdIn(List<Integer> ids){
		try {
			
			return itemMapper.findByIdIn(ids);

		} catch (Exception e) {
			
			throw new RuntimeException();
			
		}
	};	

}
