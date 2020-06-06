package com.gaurav.madassignment2;

import java.io.Serializable;

public class PhoneClass implements Serializable {

    String name, price, description;

    public PhoneClass(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public PhoneClass() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
