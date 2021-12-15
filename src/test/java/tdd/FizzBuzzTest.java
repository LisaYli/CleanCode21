package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("Hello Al lThis Very Silly Test Ok")
    void testThatMethodCallReturnsOne () {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    @DisplayName("returns 2")
    void testThatMethodCallReturnsTwo () {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    @DisplayName("given number 3 returns fizz")
    void testThatMethodCallReturnsFizz () {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6})
    @DisplayName("Given number divisible by 3 returns fizz")
    void testThatMethodCallReturnsFizz (int number) {
        assertEquals("fizz", FizzBuzz.fizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {10,25})
    @DisplayName("Given number divisible by 5 returns buzz")
    void testThatMethodCallReturnsBuzz (int number) {
        assertEquals("buzz", FizzBuzz.fizzBuzz(number));
    }


}
