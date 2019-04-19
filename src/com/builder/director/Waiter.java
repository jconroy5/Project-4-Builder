package com.builder.director;

import com.builder.builders.*;

/*
Waiter is the director class.
The waiter can select the concrete builder to use, order a pizza to be constructed, and deliver a completed pizza.
 */

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    //selects which concrete builder will be used to make a pizza
    public void setPizzaBuilder(PizzaBuilder chef) {
        pizzaBuilder = chef;
    }

    //tells the selected builder to make a pizza
    public void constructPizza() {
        System.out.println("\nThe pizza is being prepared...");
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildCrust();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildToppings();
        pizzaBuilder.setPrice();
    }

    //returns the selected pizza builder's completed pizza
    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}