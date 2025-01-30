package com.designs.patterns.creational.singleton.cloneserialize;

import java.io.Serializable;

public class WrongSingleton implements Cloneable, Serializable {

    /**
     * Making constructor private.
     */
    private WrongSingleton() {
        System.out.println("Initializing Singleton Class. Cloneable Serialize Wrong Implementation.");
    }

    private static class SingletonHelper {
        private static final WrongSingleton INSTANCE = new WrongSingleton();
    }

    public static WrongSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public WrongSingleton clone() {
        try {
            return (WrongSingleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
