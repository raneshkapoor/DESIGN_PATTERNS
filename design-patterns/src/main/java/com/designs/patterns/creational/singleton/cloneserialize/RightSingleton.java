package com.designs.patterns.creational.singleton.cloneserialize;

import java.io.Serializable;

public class RightSingleton implements Cloneable, Serializable {

    /**
     * Making constructor private.
     */
    private RightSingleton() {
        System.out.println("Initializing Singleton Class. Cloneable Serialize Right Implementation.");
    }

    private static class SingletonHelper {
        private static final RightSingleton INSTANCE = new RightSingleton();
    }

    public static RightSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public RightSingleton clone() {
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve() {
        return SingletonHelper.INSTANCE;
    }

}
