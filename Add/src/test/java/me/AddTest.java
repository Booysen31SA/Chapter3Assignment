package me;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    private Add add;

    @Before
    public void setUp() throws Exception {

        add = new Add();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {

        int result = add.add(2,2);
        Assert.assertEquals("2 + 2 = 4", 4 , result);
    }
}