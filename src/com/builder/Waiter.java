package com.builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder chef) {
        pizzaBuilder = chef;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
        pizzaBuilder.setPrice();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
