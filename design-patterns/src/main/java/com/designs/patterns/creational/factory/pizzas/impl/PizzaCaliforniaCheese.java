package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public class PizzaCaliforniaCheese extends Pizza {

    public PizzaCaliforniaCheese() {
        super.setPizzaType(PizzaType.CHEESE);
    }

    public void pizzaBase() {
        System.out.println("Pizza Base for Cheese Pizza in California Style.");
    }

    public void pizzaSauce() {
        System.out.println("Pizza Sauce for Cheese Pizza in California Style.");
    }

    public void pizzaToppings() {
        System.out.println("Pizza Toppings for Cheese Pizza in California Style.");
    }

}
