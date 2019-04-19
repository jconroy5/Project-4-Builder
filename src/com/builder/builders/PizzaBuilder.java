package com.builder.builders;

/*
PizzaBuilder is the abstract builder.
Contains abstract build and setPrice methods.
 */

public abstract class PizzaBuilder {
    protected Pizza pizza;

    //returns a completed pizza, and prints it to the console
    public Pizza getPizza() {
        System.out.println("Waiter has delivered the pizza to the customer.\n");
        return pizza;
    }

    //initiates a new pizza to be created by a concrete builder
    public void createNewPizza() {
        pizza = new Pizza();
    }

    //abstract build methods and setPrice method
    public abstract void buildCrust();
    public abstract void buildSauce();
    public abstract void buildToppings();
    public abstract void setPrice();
}