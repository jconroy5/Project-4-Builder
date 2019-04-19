package com.builder;

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
