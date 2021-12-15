package tdd;


public class FizzBuzz {
    public static String fizzBuzz(int number) {
        var divisibleBy3 = isDivisibleBy3(number);
        var divisibleBy5 = isDivisibleBy5(number);
        if (divisibleBy3 && divisibleBy5) {
            return "fizz buzz";
        }else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
