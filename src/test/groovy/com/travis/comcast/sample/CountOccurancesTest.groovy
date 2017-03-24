package com.travis.comcast.sample
/**
 * Created by nishita.kheur on 3/23/17.
 */



import org.testng.Assert
import org.testng.annotations.Test
class CountOccurancesTest {


    @Test
    public void testCountOccurances() {

        CountOccurances co = new CountOccurances()
        Assert.assertEquals(co.countMethod("Hello you!"), "Hello you!")

    }

    @Test
    public void testNull(){
        CountOccurances co = new CountOccurances()
        Assert.assertNotNull(co.countMethod("Hello you!"))
    }

}
