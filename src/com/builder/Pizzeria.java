package com.builder;

public class Pizzeria {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder deepDish = new ChicagoStyleBuilder();
        PizzaBuilder hawaiian = new HawaiianStyleBuilder();

        waiter.setPizzaBuilder(deepDish);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
