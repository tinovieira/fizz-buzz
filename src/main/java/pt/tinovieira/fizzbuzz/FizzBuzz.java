package pt.tinovieira.fizzbuzz;

public class FizzBuzz {

    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz % 3 == 0) {
            return "fizz";
        }

        return String.valueOf(toConvertToFizzBuzz);
    }
}
