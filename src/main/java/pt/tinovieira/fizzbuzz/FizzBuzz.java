package pt.tinovieira.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {

        if (argumentsAreValid(args)) {

            final Integer firstNumber = parseArgumentString(args[0], "First");
            final Integer secondNumber = parseArgumentString(args[1], "Second");

            if (parametersAreValid(firstNumber, secondNumber)) {

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

    private static boolean argumentsAreValid(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of parameters, should be two (Usage: fizzbuzz 2 16)");
            return false;
        }
        return true;
    }

    private static boolean parametersAreValid(Integer firstParameter, Integer secondParameter) {
        return firstParameter != null && secondParameter != null;
    }

    private static Integer parseArgumentString(String value, String position) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println(position + " parameter is not an Integer");
        }
        return null;
    }

}
