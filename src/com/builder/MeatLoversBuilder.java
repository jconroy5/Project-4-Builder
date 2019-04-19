package com.builder;

public class MeatLoversBuilder extends PizzaBuilder{
    public void buildCrust() {
        pizza.setCrust("Regular Crust");
    }

    public void buildSauce() {
        pizza.setSauce("Mild Tomato");
    }

    public void buildToppings() {
        pizza.setToppings("sausage, pepperoni, ham");
    }

    public void setPrice() {
        pizza.setPrice(14.99);
    }
}
