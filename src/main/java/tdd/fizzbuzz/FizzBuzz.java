package tdd.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String answer = "";
        if (isDivisibleBy3(number)) {
            answer += "fizz";
        }
        if (isDivisibleBy5(number)) {
            answer += "buzz";
        }
        if (!answer.isEmpty())
            return answer;
        return String.valueOf(number);
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
