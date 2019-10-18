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

}
