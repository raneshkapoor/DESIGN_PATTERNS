package com.designs.patterns.creational.singleton.doublechecklock;

public class MySingletonClass {

    private static volatile MySingletonClass INSTANCE;

    /**
     * Making constructor private.
     */
    private MySingletonClass() {
        System.out.println("Initializing Singleton Class. Double Check Lock Implementation.");
    }

    public static MySingletonClass getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingletonClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingletonClass();
                }
            }
        }
        return INSTANCE;
    }

}
