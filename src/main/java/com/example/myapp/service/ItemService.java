package com.example.myapp.service;

import java.util.List;

import com.example.myapp.dto.ItemDTO;

public interface ItemService {

	public List<ItemDTO> selectAll();
	public List<ItemDTO> findByIdIn(List<Integer> ids);

} 