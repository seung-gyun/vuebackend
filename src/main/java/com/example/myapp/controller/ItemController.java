package com.example.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.ItemDTO;
import com.example.myapp.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemservice;
	
	@GetMapping("/api/items")
	public List<ItemDTO> getItems() {
		
		List<ItemDTO> items = new ArrayList<>();
		items = itemservice.selectAll();

		return items;

	}
}