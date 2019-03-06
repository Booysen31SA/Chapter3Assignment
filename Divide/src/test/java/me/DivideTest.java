package me;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {

    private Divide div;

    @Before
    public void setUp() throws Exception {

        div = new Divide();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divide() {

        int result = div.divide(4,2);
        Assert.assertEquals("4/2 = 2", 2,result);
    }
}