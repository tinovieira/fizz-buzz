package pt.tinovieira.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testTheNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("4", fizzBuzz.convert(4));
    }

    @Test
    public void testMultiplesOfThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("fizz", fizzBuzz.convert(3));
        Assert.assertEquals("fizz", fizzBuzz.convert(6));
    }

    @Test
    public void testMultiplesOfFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("buzz", fizzBuzz.convert(5));
        Assert.assertEquals("buzz", fizzBuzz.convert(10));
    }

    @Test
    public void testMultipleOfFifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("fizzbuzz", fizzBuzz.convert(15));
        Assert.assertEquals("fizzbuzz", fizzBuzz.convert(30));
    }

}
