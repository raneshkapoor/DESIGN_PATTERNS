package com.designs.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testCarBuilder() {

        Car car = new Car.CarBuilder("abc123", "abcd1234")
                .name("Honda")
                .build();

        Assert.assertEquals("Honda", car.getName());
        Assert.assertNull(car.getDescription());
    }

}
