package com.example.hp_pc.recyclerviewgridviewproduct;

public class Product {
    int id;
    String name;
    String image;
    double price;

    public Product() {
    }

    public Product(String image, double price) {
        this.image = image;
        this.price = price;
    }

    public Product(int profile, String s) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
