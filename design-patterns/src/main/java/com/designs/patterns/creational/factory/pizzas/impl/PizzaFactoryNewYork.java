package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.PizzaFactory;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public class PizzaFactoryNewYork extends PizzaFactory {

    public Pizza getPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new PizzaNewYorkCheese();
            case FARMHOUSE:
                return new PizzaNewYorkFarmhouse();
            case VEGGIE_FEAST:
                return new PizzaNewYorkVeggieFeast();
            default:
                return null;
        }
    }

}
