package com.designs.patterns.creational.singleton.cloneserialize;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WrongSingletonTest {

    @Test
    public void testCloneable() {

        WrongSingleton obj = WrongSingleton.getInstance();
        WrongSingleton clone = obj.clone();

        Assert.assertNotEquals(obj, clone);
    }

    @Test
    public void testSerializable() throws IOException, ClassNotFoundException {

        WrongSingleton obj = WrongSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("file.txt")));
        out.writeObject(obj);
        out.close();

        ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("file.txt")));
        WrongSingleton serialized = (WrongSingleton) in.readObject();
        in.close();

        Assert.assertNotEquals(obj, serialized);
    }

}
