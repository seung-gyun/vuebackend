package com.example.myapp.Service;


import org.springframework.stereotype.Service;

import com.example.myapp.DTO.Item;
import com.example.myapp.Mapper.ItemMapper;

@Service
public class ItemService {

    private final ItemMapper userMapper;

    public ItemService(ItemMapper userMapper){
        this.userMapper = userMapper;
    }

    public Item findAll(){
        try {
            return userMapper.findAll();    
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }        

    }

}
