package me;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    private Multiply multi;

    @Before
    public void setUp() throws Exception {

        multi = new Multiply();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiply() {

        int result = multi.multiply(2,2);
        Assert.assertEquals("2*2 = 4", 4, result);
    }
}