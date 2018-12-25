package com.example.admin.adapterdemo.entity;

public class Product {
    private int id;
    private double price;
    private String image;

    public Product() {
    }

    public Product(double price, String image) {
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
