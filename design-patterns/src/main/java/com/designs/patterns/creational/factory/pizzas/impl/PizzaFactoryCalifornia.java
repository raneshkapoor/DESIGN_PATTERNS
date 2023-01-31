package com.designs.patterns.creational.factory.pizzas.impl;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.PizzaFactory;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public class PizzaFactoryCalifornia extends PizzaFactory {

    public Pizza getPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new PizzaCaliforniaCheese();
            case FARMHOUSE:
                return new PizzaCaliforniaFarmhouse();
            case VEGGIE_FEAST:
                return new PizzaCaliforniaVeggieFeast();
            default:
                return null;
        }
    }

}
