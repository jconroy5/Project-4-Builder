package com.builder.builders;

/*
HawaiianStyleBuilder is a concrete builder; a sub-class of PizzaBuilder.
Each build method defines the type of component being added to the pizza.
As components are added to the pizza, they are also printed to the console in the Pizzeria client.
 */

public class HawaiianStyleBuilder extends PizzaBuilder{
    public void buildCrust() {
        pizza.setCrust("Thin Crust");
        System.out.println("\nMaking Dough: " + pizza.getCrust());
    }

    public void buildSauce() {
        pizza.setSauce("Mild Tomato");
        System.out.println("Adding Sauce: " + pizza.getSauce());
    }

    public void buildToppings() {
        pizza.setToppings("cheese, ham, pineapple");
        System.out.println("Adding Toppings: " + pizza.getToppings());
    }

    public void setPrice() {
        pizza.setPrice(19.99);
        System.out.println("Printing Customer Bill: " + pizza.getPrice() + "\n");
    }
}