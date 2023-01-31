package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public class PizzaCaliforniaVeggieFeast extends Pizza {

    public PizzaCaliforniaVeggieFeast() {
        super.setPizzaType(PizzaType.VEGGIE_FEAST);
    }

    public void pizzaBase() {
        System.out.println("Pizza Base for Veggie Feast Pizza in California Style.");
    }

    public void pizzaSauce() {
        System.out.println("Pizza Sauce for Veggie Feast Pizza in California Style.");
    }

    public void pizzaToppings() {
        System.out.println("Pizza Toppings for Veggie Feast Pizza in California Style.");
    }

}
