package com.example.myapp.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.dto.CartDTO;


@Mapper
public interface CartMapper {

    public List<CartDTO> findByMemberId(int memberId);
    public CartDTO findByMemberIdAndItemId(int memberId, int itemId);
    public void cartSave(CartDTO cartdto);

}