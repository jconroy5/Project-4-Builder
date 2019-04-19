package com.builder;

public class HawaiianStyleBuilder extends PizzaBuilder{
    public void buildCrust() {
        pizza.setCrust("Thin Crust");
    }

    public void buildSauce() {
        pizza.setSauce("Mild Tomato");
    }

    public void buildToppings() {
        pizza.setToppings("cheese, ham, pineapple");
    }

    public void setPrice() {
        pizza.setPrice(19.99);
    }
}
