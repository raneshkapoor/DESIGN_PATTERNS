package com.designs.patterns.creational.singleton.enums;

public enum SingletonEnum {

    INSTANCE;

    int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
