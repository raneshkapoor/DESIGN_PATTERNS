package com.designs.patterns.creational.singleton.eager;

public class MySingletonClass {

    private static final MySingletonClass INSTANCE = new MySingletonClass();

    /**
     * Making constructor private.
     */
    private MySingletonClass() {
        System.out.println("Initializing Singleton Class. Eager Initialization Implementation.");
    }

    public static MySingletonClass getInstance() {
        return INSTANCE;
    }

}
