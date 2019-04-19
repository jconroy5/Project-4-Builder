package com.builder.director;

import com.builder.builders.*;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder chef) {
        pizzaBuilder = chef;
    }

    public void constructPizza() {
        System.out.println("\nThe pizza is being prepared...");
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildCrust();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildToppings();
        pizzaBuilder.setPrice();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
