package com.designs.patterns.creational.factory;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.PizzaFactory;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;
import com.designs.patterns.creational.factory.pizzas.impl.PizzaFactoryNewYork;

public class FactoryPatternMain {

    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactoryNewYork();

        Pizza pizza = factory.getPizza(PizzaType.FARMHOUSE);

        pizza.pizzaBase();
        pizza.pizzaSauce();
        pizza.pizzaToppings();

    }

}
