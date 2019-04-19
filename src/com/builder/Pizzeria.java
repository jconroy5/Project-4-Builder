package com.builder;

public class Pizzeria {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder deepDish = new ChicagoStyleBuilder();
        PizzaBuilder hawaiian = new HawaiianStyleBuilder();

        System.out.println("Welcome to Joe's Pizzeria");
        System.out.println("\nMENU: \nChicago Style Pizza..........$24.99 \nHawaiian Style Pizza..........$19.99");

        System.out.println("\n*****Order Placed: Chicago Style Pizza*****\n");
        waiter.setPizzaBuilder(deepDish);
        waiter.constructPizza();
        Pizza pizzaOrder1 = waiter.getPizza();
        System.out.println("Order Delivered to Customer: \n" + pizzaOrder1.getCrust() + " Pizza, with " +
                pizzaOrder1.getSauce() + " sauce, topped with " + pizzaOrder1.getToppings());
        System.out.println("\nCustomer Bill: $" + pizzaOrder1.getPrice());

        System.out.println("\n*****Order Placed: Hawaiian Style Pizza*****\n");
        waiter.setPizzaBuilder(hawaiian);
        waiter.constructPizza();
        Pizza pizzaOrder2 = waiter.getPizza();
        System.out.println("Order Delivered to Customer: \n" + pizzaOrder2.getCrust() + " Pizza, with " +
                pizzaOrder2.getSauce() + " sauce, topped with " + pizzaOrder2.getToppings());
        System.out.println("\nCustomer Bill: $" + pizzaOrder2.getPrice());
    }
}
