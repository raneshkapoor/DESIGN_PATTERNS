package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public class PizzaNewYorkFarmhouse extends Pizza {

    public PizzaNewYorkFarmhouse() {
        super.setPizzaType(PizzaType.FARMHOUSE);
    }

    public void pizzaBase() {
        System.out.println("Pizza Base for Farmhouse Pizza in New York Style.");
    }

    public void pizzaSauce() {
        System.out.println("Pizza Sauce for Farmhouse Pizza in New York Style.");
    }

    public void pizzaToppings() {
        System.out.println("Pizza Toppings for Farmhouse Pizza in New York Style.");
    }

}
