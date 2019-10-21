package pt.tinovieira.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testTheNumber() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("4", fizzBuzz.convert(4));
    }

    @Test
    public void testMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("fizz", fizzBuzz.convert(3));
        Assert.assertEquals("fizz", fizzBuzz.convert(6));
    }

    @Test
    public void testMultiplesOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("buzz", fizzBuzz.convert(5));
        Assert.assertEquals("buzz", fizzBuzz.convert(10));
    }

    @Test
    public void testMultipleOfFifteen() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("fizzbuzz", fizzBuzz.convert(15));
        Assert.assertEquals("fizzbuzz", fizzBuzz.convert(30));
    }

    @Test
    public void testZero() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("fizzbuzz", fizzBuzz.convert(0));
    }

}
