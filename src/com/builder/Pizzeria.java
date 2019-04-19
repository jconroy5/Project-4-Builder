package com.builder;

public class Pizzeria {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder deepDish = new ChicagoStyleBuilder();
        PizzaBuilder hawaiian = new HawaiianStyleBuilder();
        PizzaBuilder meatLovers = new MeatLoversBuilder();

        System.out.println("Welcome to Joe's Pizzeria!");
        System.out.println("\nMENU:" +
                "\nChicago Style Pizza..........$24.99" +
                "\nHawaiian Style Pizza..........$19.99" +
                "\nMeat Lovers Pizza..........$14.99\n");

        System.out.println("\n*****Order Placed: Chicago Style Pizza*****");
        waiter.setPizzaBuilder(deepDish);
        waiter.constructPizza();
        Pizza pizzaOrder1 = waiter.getPizza();


        System.out.println("\n*****Order Placed: Hawaiian Style Pizza*****");
        waiter.setPizzaBuilder(hawaiian);
        waiter.constructPizza();
        Pizza pizzaOrder2 = waiter.getPizza();

        System.out.println("\n*****Order Placed: Meat Lovers Pizza*****");
        waiter.setPizzaBuilder(meatLovers);
        waiter.constructPizza();
        Pizza pizzaOrder3 = waiter.getPizza();
    }
}
