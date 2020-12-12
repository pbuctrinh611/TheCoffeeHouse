package com.example.coffehouse;

public class Product_order {
    private int quantity;
    private int price;



    public Product_order() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getTotalMoney(){
        return price*quantity;
    }
}
