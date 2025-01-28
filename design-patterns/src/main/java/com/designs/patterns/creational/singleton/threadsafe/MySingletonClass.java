package com.designs.patterns.creational.singleton.threadsafe;

public class MySingletonClass {

    private static MySingletonClass INSTANCE;

    /**
     * Making constructor private.
     */
    private MySingletonClass() {
        System.out.println("Initializing Singleton Class. Thread safe Implementation.");
    }

    public static synchronized MySingletonClass getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MySingletonClass();
        }
        return INSTANCE;
    }

}
