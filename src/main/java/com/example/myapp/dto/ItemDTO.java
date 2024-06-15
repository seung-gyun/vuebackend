package com.example.myapp.dto;

public class ItemDTO {
    private int id;
    private String name;    
    private String imgpath;    
    private int price;
    private String realprice;    

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
   
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getter 메서드
    public int getPrice() {
        return price;
    }

    public void setRealprice(String realprice) {
        this.realprice = realprice;
    }

    public String getRealprice() {
        return realprice;
    }

}