package com.travis.comcast.sample
/**
 * Created by nishita.kheur on 3/23/17.
 */

import org.testng.Assert
import org.testng.annotations.Test
public class CalculatorTest {


    @Test
    public void testPositiveAdd()
    {
        Calculator cl = new Calculator()
        double sum = cl.add(3,5)
        Assert.assertEquals(sum, 8.0, 0.0 )

    }

    @Test
    public void testNegativeAdd()
    {
        Calculator cl = new Calculator()
        double sum = cl.add(-9,-7)
        Assert.assertEquals(sum, -16.0, 0.0 )

    }

    @Test
    public void testPositiveNegativeAdd()
    {
        Calculator cl = new Calculator()
        double sum = cl.add(-19,7)
        Assert.assertEquals(sum, -12.0, 0.0 )

    }

    @Test
    public void testPositiveSubtract()
    {
        Calculator cl = new Calculator()
        double sum = cl.subtract(3,5)
        Assert.assertEquals(sum, -2.0, 0.0 )

    }

    @Test
    public void testNegativeSubtract()
    {
        Calculator cl = new Calculator()
        double sum = cl.subtract(-9,-7)
        Assert.assertEquals(sum, -2.0, 0.0 )

    }

    @Test
    public void testPositiveNegativeSubtract()
    {
        Calculator cl = new Calculator()
        double sum = cl.subtract(-19,7)
        Assert.assertEquals(sum, -26.0, 0.0 )

    }

    @Test
    public void testPositiveMultiply()
    {
        Calculator cl = new Calculator()
        double sum = cl.multiply(3,5)
        Assert.assertEquals(sum, 15.0, 0.0 )

    }

    @Test
    public void testNegativeMultiply()
    {
        Calculator cl = new Calculator()
        double sum = cl.multiply(-9,-7)
        Assert.assertEquals(sum, 63.0, 0.0 )

    }

    @Test
    public void testPositiveNegativeMultiplyt()
    {
        Calculator cl = new Calculator()
        double sum = cl.multiply(-9,7)
        Assert.assertEquals(sum, -63.0, 0.0 )

    }

    @Test
    public void testPositiveDivide()
    {
        Calculator cl = new Calculator()
        double sum = cl.divide(6,3)
        Assert.assertEquals(sum, 2.0, 0.0 )

    }

    @Test
    public void testNegativeDivide()
    {
        Calculator cl = new Calculator()
        double sum = cl.divide(-9,3)
        Assert.assertEquals(sum, -3.0, 0.0 )

    }

    public void testPositiveNegativeDivide()
    {
        Calculator cl = new Calculator()
        double sum = cl.divide(12,-4)
        Assert.assertEquals(sum, -3.0, 0.0 )

    }

}
