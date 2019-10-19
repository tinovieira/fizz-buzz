package pt.tinovieira.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int toConvert) {
        final String conversion;

        if (toConvert % 15 == 0) {
            conversion = "fizzbuzz";
        } else if (toConvert % 5 == 0) {
            conversion = "buzz";
        } else if (toConvert % 3 == 0) {
            conversion = "fizz";
        } else {
            conversion = String.valueOf(toConvert);
        }

        return conversion;
    }

}
