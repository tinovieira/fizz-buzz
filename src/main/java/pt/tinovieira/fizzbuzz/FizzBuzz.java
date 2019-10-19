package pt.tinovieira.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of parameters, should be two (Usage: fizzbuzz 2 16)");
        } else {
            final Integer firstNumber = parseString(args[0], "First");
            final Integer secondNumber = parseString(args[1], "Second");

            if (firstNumber != null && secondNumber != null) {
                final FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
                if (firstNumber <= secondNumber) {
                    for (int i = firstNumber; i <= secondNumber; i++) {
                        System.out.print(fizzBuzz.convert(i) + " ");
                    }
                } else {
                    for (int i = firstNumber; i >= secondNumber; i--) {
                        System.out.print(fizzBuzz.convert(i) + " ");
                    }
                }
            }
        }
    }

    private static Integer parseString(String value, String position) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println(position + " parameter is not an Integer");
        }
        return null;
    }
}
