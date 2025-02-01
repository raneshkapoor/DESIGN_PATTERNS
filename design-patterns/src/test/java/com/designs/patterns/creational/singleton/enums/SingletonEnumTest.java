package com.designs.patterns.creational.singleton.enums;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SingletonEnumTest {

    private static final int SIZE = 100000;

    @Test
    public void testSingleton() {

        SingletonEnum one = SingletonEnum.INSTANCE;
        SingletonEnum two = SingletonEnum.INSTANCE;
        one.setValue(1);

        Assert.assertEquals(one, two);
        Assert.assertEquals(1, two.getValue());
    }

    @Test
    public void testSingletonMultiple() {

        SingletonEnum[] arr = new SingletonEnum[SIZE];

        SingletonEnum obj = SingletonEnum.INSTANCE;

        Arrays.fill(arr, SingletonEnum.INSTANCE);

        for (int i = 0; i < SIZE; i++) {
            Assert.assertEquals(obj, arr[i]);
        }
    }

    @Test
    public void testSingletonMultiThreaded() throws InterruptedException {

        SingletonEnum obj = SingletonEnum.INSTANCE;

        MyThread[] threads = new MyThread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
            Thread thread = new Thread(threads[i]);
            thread.start();
        }

        Thread.sleep(5000);

        for (MyThread thread : threads) {
            SingletonEnum[] arr = thread.getArr();
            for (SingletonEnum singletonEnum : arr) {
                Assert.assertEquals(obj, singletonEnum);
            }
        }

    }

    private static class MyThread implements Runnable {

        private final SingletonEnum[] arr = new SingletonEnum[SIZE];

        public SingletonEnum[] getArr() {
            return arr;
        }

        @Override
        public void run() {
            Arrays.fill(arr, SingletonEnum.INSTANCE);
        }
    }

}
