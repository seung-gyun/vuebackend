package com.example.myapp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.DTO.Item;
import com.example.myapp.Service.ItemService;

@RestController
public class UserController {
    private final ItemService itemService;

    public UserController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/users")
    public Item findAll() {
        return itemService.findAll();
    }
}