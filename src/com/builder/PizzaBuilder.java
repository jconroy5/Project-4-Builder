package com.builder;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        System.out.println("Waiter has delivered the pizza to the customer.\n");
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildCrust();
    public abstract void buildSauce();
    public abstract void buildToppings();
    public abstract void setPrice();
}
