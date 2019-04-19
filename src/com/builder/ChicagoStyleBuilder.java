package com.builder;

public class ChicagoStyleBuilder extends PizzaBuilder{
    public void buildCrust() {
        pizza.setCrust("Deep Dish");
    }

    public void buildSauce() {
        pizza.setSauce("Spicy Tomato");
    }

    public void buildToppings() {
        pizza.setToppings("cheese, pepperoni, mushrooms, black olives");
    }

    public void setPrice() {
        pizza.setPrice(24.99);
    }
}
