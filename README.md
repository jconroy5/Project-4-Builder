# Project 4 - Builder
COMP 373/473 - Project 4 - Builder Pattern - Joseph Conroy and Nigel Castelino

Our other Project 4 program, using the Visitor Pattern, can be found [here.](https://github.com/jconroy5/Project-4-Visitor)

The complete documentation on both programs can be found [here.](https://docs.google.com/document/d/1BW9LqjgYKb-UkST9ezza5xXmOWNW3Q2J5LcnLgNSkGA/edit?usp=sharing)

# To run the client:
Run Pizzeria.java, found in 
```
src/com/builder/client
```

# Project Description:
For our Builder pattern, we created a Pizzeria program which uses a waiter (director) to take orders from a customer, and pizza builders to construct the requested pizzas. The builder pattern works well for this type of program because it uses concrete builders to construct the different kinds of pizzas, which each have different components, like crust, sauce, toppings, and price. Without using this pattern, the waiter (director) would have to specify each individual component of a pizza for it to be constructed, which is far less efficient.

The client package contains Pizzeria, which contains the program’s main method. The method initiates a new waiter and the concrete pizza builders. Then, three example orders are made, one for each type of pizza. The waiter selects the appropriate pizza builder and tells it to construct the pizza. As the pizza is constructed, the components being added to the pizza are printed to the console. Finally, once the requested pizza is constructed, the waiter delivers the pizza to the customer.

The director package contains the Waiter class. In this program, the waiter represents the director, which selects the pizza builder and gives it commands. The setPizzaBuilder method is used to select the appropriate concrete builder to use, based on the customer’s order. The constructPizza method is used to tell the selected pizza builder to create a new pizza and run its build methods to add the components. The getPizza method returns the selected pizza builder’s newly constructed pizza.

The builders package contains the Pizza product, the abstract builder PizzaBuilder, and its concrete builder subclasses, ChicagoStyleBuilder, HawaiianStyleBuilder, and MeatLoversBuilder. The Pizza class represents the final product being made by the builders, and contains the variables, getters, and setters for the components of the pizza (crust, sauce, toppings, and price). PizzaBuilder is the abstract builder class, and contains the getPizza, createNewPizza, and abstract build methods used by the concrete builders. Each concrete pizza builder sets the Pizza product variables in each respective build method, and prints them to the console.


# Project Rubric:

Project 4: Implementing Patterns II

Project Description:

In this project, we will practice the implementation of design patterns.
You need to design and implement:

– Visitor Pattern

– Any Pattern of your choice from the list that we have covered in class “Patterns Deep
Dive II”. 

You can implement both patterns in the same implementation or separately.

Supporting documents:

- Class notes and examples as well as links for patterns

- Design Patterns book by Gamma

- Search on the web to get more information on the patterns

Project Expectation:

- Group executed project

- Submission of Design and Code

Project Submission and Grading:

- 10% of total grade

- Email

- Complete documentation on what problem you solved with the patterns

- Your code OR the location of your solution for the implementation

Project Due Date:

- Submission of the Implementation: EOD 04/21/2019
