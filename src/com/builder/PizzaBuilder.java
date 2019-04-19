package com.builder;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildCrust();
    public abstract void buildSauce();
    public abstract void buildToppings();
    public abstract void setPrice();
}
