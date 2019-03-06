package PartOne;

import org.junit.*;

import static org.junit.Assert.*;

public class VehicleTest {



    private Vehicle car;

    @Before
    public void setUp() throws Exception {

        car = new Vehicle();

    }

    @After
    public void tearDown() throws Exception {
    }

    //Object Equality
    @Test
    public void carTypeTestOne() {

      String carType = car.carType("Toyota");
      Assert.assertEquals("Object Equality", "Toyota", carType);
    }

    //object identity
    @Test
    public void carTypeTestTwo() {

        String carType = car.carType("Toyota");
        Assert.assertSame("object identity", "Toyota", carType);
    }

    //failed test
    @Test
    public void carTypeTestThree() {

        String carType = car.carType("Toyota");
        Assert.assertSame("Failed test", "VW", carType);
    }

    //exceptionTest
    @Test(expected = Exception.class)
    public void carTypeTestFour() {

        int value = car.wheels("car");

        Assert.assertEquals("Exception Test", 2, value);
    }

    //Time out
    @Test(timeout = 1)
    public void carTypeTestFive() {

        String carType = car.carType("Toyota");

    }
    //disableTest
    //exceptionTest

    @Ignore("Do Nothing")
    @Test(expected = Exception.class)
    public void carTypeTestSix() {

        int value = car.wheels("car");

        Assert.assertEquals("Exception Test", 2, value);
    }

}