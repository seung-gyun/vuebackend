package com.example.myapp.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.dto.MemberDTO;

@Mapper
public interface MemberMapper {
    MemberDTO findByEmailAndPassword(String email, String password);
}