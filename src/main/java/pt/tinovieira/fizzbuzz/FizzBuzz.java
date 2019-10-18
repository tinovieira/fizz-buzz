package pt.tinovieira.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of parameters (Usage: fizzbuzz 2 16");
        } else {
            Integer first = null;
            Integer second = null;
            try {
                first = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("First parameter is not a Integer");
            }
            try {
                second = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Second parameter is not a Integer");
            }

            if (first != null && second != null) {
                if (first <= second) {
                    for (int i = first; i <= second; i++) {
                        System.out.print(convert(i) + " ");
                    }
                } else {
                    for (int i = first; i >= second; i--) {
                        System.out.print(convert(i) + " ");
                    }
                }
            }
        }
    }

    static String convert(int toConvertToFizzBuzz) {

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
