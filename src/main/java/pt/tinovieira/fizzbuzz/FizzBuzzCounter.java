package pt.tinovieira.fizzbuzz;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FizzBuzzCounter {

    public Map<String, Long> count(List<String> input) {
        final Map<String, Long> countedStrings = input.stream()
                .filter(this::isNotInteger)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final Long countedIntegers = input.stream().filter(this::isInteger).count();
        countedStrings.put("integer", countedIntegers);

        return countedStrings;
    }

    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isNotInteger(String s) {
        return !isInteger(s);
    }

}
