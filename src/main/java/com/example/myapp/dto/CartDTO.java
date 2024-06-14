package com.example.myapp.dto;

public class CartDTO {
    
    private int id;
    private int memberId;
    private int itemId;

    public void setId(int id) {
        this.id = id;
    }

    // Getter 메서드
    public int getId() {
        return id;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }
   
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

}