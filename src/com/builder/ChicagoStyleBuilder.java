package com.builder;

public class ChicagoStyleBuilder extends PizzaBuilder{
    public void buildCrust() {
        pizza.setCrust("Deep Dish");
        System.out.println("\nMaking Dough: " + pizza.getCrust());
    }

    public void buildSauce() {
        pizza.setSauce("Spicy Tomato");
        System.out.println("Adding Sauce: " + pizza.getSauce());
    }

    public void buildToppings() {
        pizza.setToppings("cheese, pepperoni, mushrooms, black olives");
        System.out.println("Adding Toppings: " + pizza.getToppings());
    }

    public void setPrice() {
        pizza.setPrice(24.99);
        System.out.println("Printing Customer Bill: " + pizza.getPrice() + "\n");
    }
}
