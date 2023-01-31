package com.designs.patterns.creational.factory;

import com.designs.patterns.creational.factory.pizzas.Pizza;
import com.designs.patterns.creational.factory.pizzas.PizzaFactory;
import com.designs.patterns.creational.factory.pizzas.enums.PizzaType;
import com.designs.patterns.creational.factory.pizzas.impl.PizzaFactoryCalifornia;
import com.designs.patterns.creational.factory.pizzas.impl.PizzaFactoryNewYork;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class FactoryPatternTest {

    private PizzaFactory pizzaFactory;
    private Pizza pizza;

    @After
    public void makePizza() {
        pizza.make();
    }

    @Test
    public void testNewYorkCheesePizza() {

        pizzaFactory = new PizzaFactoryNewYork();
        pizza = pizzaFactory.getPizza(PizzaType.CHEESE);

        Assert.assertEquals(PizzaType.CHEESE, pizza.getPizzaType());
    }

    @Test
    public void testNewYorkFarmhousePizza() {

        pizzaFactory = new PizzaFactoryNewYork();
        pizza = pizzaFactory.getPizza(PizzaType.FARMHOUSE);

        Assert.assertEquals(PizzaType.FARMHOUSE, pizza.getPizzaType());
    }

    @Test
    public void testNewYorkVeggieFeastPizza() {

        pizzaFactory = new PizzaFactoryNewYork();
        pizza = pizzaFactory.getPizza(PizzaType.VEGGIE_FEAST);

        Assert.assertEquals(PizzaType.VEGGIE_FEAST, pizza.getPizzaType());
    }

    @Test
    public void testCaliforniaCheesePizza() {

        pizzaFactory = new PizzaFactoryCalifornia();
        pizza = pizzaFactory.getPizza(PizzaType.CHEESE);

        Assert.assertEquals(PizzaType.CHEESE, pizza.getPizzaType());
    }

    @Test
    public void testCaliforniaFarmhousePizza() {

        pizzaFactory = new PizzaFactoryCalifornia();
        pizza = pizzaFactory.getPizza(PizzaType.FARMHOUSE);

        Assert.assertEquals(PizzaType.FARMHOUSE, pizza.getPizzaType());
    }

    @Test
    public void testCaliforniaVeggieFeastPizza() {

        pizzaFactory = new PizzaFactoryCalifornia();
        pizza = pizzaFactory.getPizza(PizzaType.VEGGIE_FEAST);

        Assert.assertEquals(PizzaType.VEGGIE_FEAST, pizza.getPizzaType());
    }

}
