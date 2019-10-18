package pt.tinovieira.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testTheNumber() {
        Assert.assertEquals("1", FizzBuzz.convert(1));
        Assert.assertEquals("4", FizzBuzz.convert(4));
    }

    @Test
    public void testMultiplesOfThree() {
        Assert.assertEquals("fizz", FizzBuzz.convert(3));
        Assert.assertEquals("fizz", FizzBuzz.convert(6));
    }

    @Test
    public void testMultiplesOfFive() {
        Assert.assertEquals("buzz", FizzBuzz.convert(5));
        Assert.assertEquals("buzz", FizzBuzz.convert(10));
    }

    @Test
    public void testMultipleOfFifteen() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.convert(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.convert(30));
    }

}
