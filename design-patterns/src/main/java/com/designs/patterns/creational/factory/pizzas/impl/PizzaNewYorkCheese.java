package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public class PizzaNewYorkCheese extends Pizza {

    public PizzaNewYorkCheese() {
        super.setPizzaType(PizzaType.CHEESE);
    }

    public void pizzaBase() {
        System.out.println("Pizza Base for Cheese Pizza in New York Style.");
    }

    public void pizzaSauce() {
        System.out.println("Pizza Sauce for Cheese Pizza in New York Style.");
    }

    public void pizzaToppings() {
        System.out.println("Pizza Toppings for Cheese Pizza in New York Style.");
    }

}
