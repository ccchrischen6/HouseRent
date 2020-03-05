package com.example.houserent;

import java.io.Serializable;

public class Rent implements Serializable {
    private String location;
    private Integer price;
    private Boolean isPaidMonthly;
    private String info;

    public Rent(String location, Integer price, Boolean isPaidMonthly, String info) {
        this.location = location;
        this.price = price;
        this.isPaidMonthly = isPaidMonthly;
        this.info = info;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getPaidMonthly() {
        return isPaidMonthly;
    }

    public void setPaidMonthly(Boolean paidMonthly) {
        isPaidMonthly = paidMonthly;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString(){
        return "Location: " + location +
                "\nPrice: " + price +
                "\nIs it paid monthly? " + isPaidMonthly +
                "\nOther info: " + info;
    }
}
