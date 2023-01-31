package com.designs.patterns.creational.factory.pizzas;

import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;

public abstract class Pizza {

    private PizzaType pizzaType = PizzaType.NONE;

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void make() {
        pizzaBase();
        pizzaSauce();
        pizzaToppings();
    }

    public abstract void pizzaBase();

    public abstract void pizzaSauce();

    public abstract void pizzaToppings();

}
