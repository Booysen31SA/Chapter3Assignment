package me;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    private Subtract sub;

    @Before
    public void setUp() throws Exception {

        sub = new Subtract();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void subtract() {

        int result = sub.subtract(2,2);
        Assert.assertEquals("2-2 = 0", 0,result);
    }
}