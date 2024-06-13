package com.example.myapp.dto;

public class CartDTO {
    
    private int id;
    private String memberId;
    private String itemId;

    public void setId(int id) {
        this.id = id;
    }

    // Getter 메서드
    public int getId() {
        return id;
    }

    public void setmemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getmemberId() {
        return memberId;
    }
   
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

}