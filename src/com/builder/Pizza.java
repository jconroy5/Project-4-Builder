package com.builder;

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";
    private double price = 0.0;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
