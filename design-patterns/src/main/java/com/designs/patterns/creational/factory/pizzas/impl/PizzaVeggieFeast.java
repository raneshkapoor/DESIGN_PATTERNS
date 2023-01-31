package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;

public class PizzaVeggieFeast implements Pizza {

    public void pizzaBase() {
        System.out.println("Pizza Base for Veggie Feast Pizza.");
    }

    public void pizzaSauce() {
        System.out.println("Pizza Sauce for Veggie Feast Pizza.");
    }

    public void pizzaToppings() {
        System.out.println("Pizza Toppings for Veggie Feast Pizza.");
    }

}
