package tdd;


public class FizzBuzz {


    public static String fizzBuzz(int number) {
        if(number % 3 == 0){
            return "fizz";
        }else if (number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(number);
    }
}
