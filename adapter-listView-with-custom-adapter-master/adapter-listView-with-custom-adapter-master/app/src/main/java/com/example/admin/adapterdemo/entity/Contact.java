package com.example.admin.adapterdemo.entity;

public class Contact {

    private  int id;
    private String phone;
    private int image;

    public Contact() {
    }

    public Contact(String phone, int image) {
        this.phone = phone;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
