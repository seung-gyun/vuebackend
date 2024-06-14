package com.example.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.dto.ItemDTO;

@Mapper
public interface ItemMapper {
    List<ItemDTO> selectAll();
    List<ItemDTO> findByIdIn(List<Integer> ids);
}