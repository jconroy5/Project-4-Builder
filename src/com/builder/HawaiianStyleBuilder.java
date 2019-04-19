package com.builder;

public class HawaiianStyleBuilder extends PizzaBuilder{
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    public void buildSauce() {
        pizza.setSauce("Mild Tomato");
    }

    public void buildTopping() {
        pizza.setTopping("ham, pineapple");
    }

    public void setPrice() {
        pizza.setPrice(19.99);
    }
}
