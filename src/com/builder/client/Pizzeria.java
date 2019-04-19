package com.builder.client;

import com.builder.builders.*;
import com.builder.director.*;

/*
Pizzeria is the client. Run it to execute the main method.
The client initiates a waiter (director) and the concrete pizza builders.
An example of each type of pizza order is made.
The waiter calls constructPizza, which tells the selected concrete builder to construct each component of the pizza.
Finally, the waiter calls getPizza, delivering it to the customer.
 */

public class Pizzeria {
    public static void main(String[] args) {

        //initiating a waiter and the concrete builders
        Waiter waiter = new Waiter();
        PizzaBuilder deepDish = new ChicagoStyleBuilder();
        PizzaBuilder hawaiian = new HawaiianStyleBuilder();
        PizzaBuilder meatLovers = new MeatLoversBuilder();

        System.out.println("Welcome to Joe's Pizzeria!");
        System.out.println("\nMENU:" +
                "\nChicago Style Pizza..........$24.99" +
                "\nHawaiian Style Pizza..........$19.99" +
                "\nMeat Lovers Pizza..........$14.99\n");

        //example pizzaOrder1, Chicago Style Pizza constructed by the ChicagoStyleBuilder
        System.out.println("\n*****Order Placed: Chicago Style Pizza*****");
        waiter.setPizzaBuilder(deepDish);
        waiter.constructPizza();
        Pizza pizzaOrder1 = waiter.getPizza();

        //example pizzaOrder2, Hawaiian Style Pizza constructed by the HawaiianStyleBuilder
        System.out.println("\n*****Order Placed: Hawaiian Style Pizza*****");
        waiter.setPizzaBuilder(hawaiian);
        waiter.constructPizza();
        Pizza pizzaOrder2 = waiter.getPizza();

        //example pizzaOrder3, Meat Lovers Pizza constructed by the MeatLoverBuilder
        System.out.println("\n*****Order Placed: Meat Lovers Pizza*****");
        waiter.setPizzaBuilder(meatLovers);
        waiter.constructPizza();
        Pizza pizzaOrder3 = waiter.getPizza();
    }
}