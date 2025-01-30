package com.designs.patterns.creational.singleton.cloneserialize;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RightSingletonTest {

    @Test
    public void testCloneable() {

        RightSingleton obj = RightSingleton.getInstance();
        RightSingleton clone = obj.clone();

        Assert.assertEquals(obj, clone);
    }

    @Test
    public void testSerializable() throws IOException, ClassNotFoundException {

        RightSingleton obj = RightSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("file.txt")));
        out.writeObject(obj);
        out.close();

        ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("file.txt")));
        RightSingleton serialized = (RightSingleton) in.readObject();
        in.close();

        Assert.assertEquals(obj, serialized);
    }

}
