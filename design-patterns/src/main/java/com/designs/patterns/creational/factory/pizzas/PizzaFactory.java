package com.designs.patterns.creational.factory.pizzas;

import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

abstract public class PizzaFactory {

    public abstract Pizza getPizza(PizzaType pizzaType);

}
