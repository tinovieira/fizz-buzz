package pt.tinovieira.fizzbuzz;

public class FizzBuzz {

    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz % 15 == 0) {
            return "fizzbuzz";
        }

        if (toConvertToFizzBuzz % 5 == 0) {
            return "buzz";
        }

        if (toConvertToFizzBuzz % 3 == 0) {
            return "fizz";
        }

        return String.valueOf(toConvertToFizzBuzz);
    }
}
