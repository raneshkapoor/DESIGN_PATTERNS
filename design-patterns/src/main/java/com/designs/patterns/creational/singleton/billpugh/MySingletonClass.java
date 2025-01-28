package com.designs.patterns.creational.singleton.billpugh;

public class MySingletonClass {

    /**
     * Making constructor private.
     */
    private MySingletonClass() {
        System.out.println("Initializing Singleton Class. Bill Pugh Implementation.");
    }

    private static class SingletonHelper {
        private static final MySingletonClass INSTANCE = new MySingletonClass();
    }

    public static MySingletonClass getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
