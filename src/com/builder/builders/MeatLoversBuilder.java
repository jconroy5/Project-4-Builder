package com.builder.builders;

/*
MeatLoversBuilder is a concrete builder; a sub-class of PizzaBuilder.
Each build method defines the type of component being added to the pizza.
As components are added to the pizza, they are also printed to the console in the Pizzeria client.
 */

public class MeatLoversBuilder extends PizzaBuilder{
    public void buildCrust() {
        pizza.setCrust("Regular Crust");
        System.out.println("\nMaking Dough: " + pizza.getCrust());
    }

    public void buildSauce() {
        pizza.setSauce("Mild Tomato");
        System.out.println("Adding Sauce: " + pizza.getSauce());
    }

    public void buildToppings() {
        pizza.setToppings("sausage, pepperoni, ham");
        System.out.println("Adding Toppings: " + pizza.getToppings());
    }

    public void setPrice() {
        pizza.setPrice(14.99);
        System.out.println("Printing Customer Bill: $" + pizza.getPrice() + "\n");
    }
}