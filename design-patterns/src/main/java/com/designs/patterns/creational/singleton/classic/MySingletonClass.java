package com.designs.patterns.creational.singleton.classic;

public class MySingletonClass {

    private static MySingletonClass INSTANCE;

    /**
     * Making constructor private.
     */
    private MySingletonClass() {
        System.out.println("Initializing Singleton Class. Classic Implementation.");
    }

    public static MySingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MySingletonClass();
        }
        return INSTANCE;
    }

}
