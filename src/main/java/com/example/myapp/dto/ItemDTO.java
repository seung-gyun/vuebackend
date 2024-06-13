package com.example.myapp.dto;

public class ItemDTO {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    // Getter 메서드
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
}