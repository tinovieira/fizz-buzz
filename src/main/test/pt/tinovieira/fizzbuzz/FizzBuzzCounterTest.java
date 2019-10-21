package pt.tinovieira.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FizzBuzzCounterTest {

    @Test
    public void testCounter() {
        final List<String> input = new ArrayList<>(Arrays.asList("1", "2", "lucky", "4", "buzz", "fizz", "7", "8",
                "fizz", "buzz", "11", "fizz", "lucky", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"));

        final Map<String, Long> count = new FizzBuzzCounter().count(input);

        Assert.assertEquals(5, count.size());
        Assert.assertEquals(Long.valueOf(4), count.get("fizz"));
        Assert.assertEquals(Long.valueOf(3), count.get("buzz"));
        Assert.assertEquals(Long.valueOf(1), count.get("fizzbuzz"));
        Assert.assertEquals(Long.valueOf(2), count.get("lucky"));
        Assert.assertEquals(Long.valueOf(10), count.get("integer"));
    }

}
