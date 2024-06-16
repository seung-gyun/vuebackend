package com.example.myapp.dto;

public class OrderDTO {
    
    private int id;
    private int memberId;
    private String name;
    private String address;
    private String payment;
    private String cardnumber;
    private String items;


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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPayment() {
        return payment;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return items;
    }

    
}