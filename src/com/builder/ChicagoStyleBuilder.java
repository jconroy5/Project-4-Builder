package com.builder;

public class ChicagoStyleBuilder extends PizzaBuilder{
    public void buildDough() {
        pizza.setDough("Deep Dish");
    }

    public void buildSauce() {
        pizza.setSauce("Spicy Tomato");
    }

    public void buildTopping() {
        pizza.setTopping("cheese, pepperoni, mushrooms, black olives");
    }

    public void setPrice() {
        pizza.setPrice(24.99);
    }
}
