package com.example.myapp.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.DTO.Item;

@Mapper
public interface ItemMapper {
    Item findAll();
}
