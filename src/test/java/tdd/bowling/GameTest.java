package tdd.bowling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tdd.fizzbuzz.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    void rolling20TimesWithNoPinsKnockedDownShouldReturnScoreZero() {
        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }



    @Test
    void rolling20TimesWithOnePinsKnockedDownShouldReturnScore20() {
        Game game = new Game();

        for (int i = 0; i<20; i++){
            game.roll(1);
        }
        assertEquals(20,game.score());
    }
    /*@ParameterizedTest
    @ValueSource(ints = {3,6})
    @DisplayName("Given number divisible by 3 returns fizz")
    void testThatMethodCallReturnsFizz (int number) {
        assertEquals("fizz", FizzBuzz.fizzBuzz(number));
        }

     */

}


