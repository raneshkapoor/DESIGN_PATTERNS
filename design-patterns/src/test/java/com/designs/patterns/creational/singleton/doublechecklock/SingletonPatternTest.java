package com.designs.patterns.creational.singleton.doublechecklock;

import org.junit.Assert;
import org.junit.Test;

public class SingletonPatternTest {

    private static final int SIZE = 100000;

    @Test
    public void testSingleton() {

        MySingletonClass obj1 = MySingletonClass.getInstance();
        MySingletonClass obj2 = MySingletonClass.getInstance();

        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testSingletonMultiple() {

        MySingletonClass[] arr = new MySingletonClass[SIZE];

        MySingletonClass obj = MySingletonClass.getInstance();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = MySingletonClass.getInstance();
        }

        for (int i = 0; i < SIZE; i++) {
            Assert.assertEquals(arr[i], obj);
        }
    }

    /**
     * Can fail.
     *
     * @throws InterruptedException throwing exception for thread sleeping
     */
    @Test
    public void testSingletonMultiThreaded() throws InterruptedException {

        MySingletonClass obj = MySingletonClass.getInstance();

        MyThread[] threads = new MyThread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
            Thread thread = new Thread(threads[i]);
            thread.start();
        }

        Thread.sleep(5000);

        for (MyThread thread : threads) {
            MySingletonClass[] arr = thread.getArr();
            for (MySingletonClass mySingletonClass : arr) {
                Assert.assertEquals(mySingletonClass, obj);
            }
        }

    }

    private static class MyThread implements Runnable {

        private final MySingletonClass[] arr = new MySingletonClass[SIZE];

        public MySingletonClass[] getArr() {
            return arr;
        }

        @Override
        public void run() {
            for (int i = 0; i < SIZE; i++) {
                arr[i] = MySingletonClass.getInstance();
            }
        }
    }

}
