package tdd.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private final Game game;

    public GameTest() {
        game = new Game();
    }

    @Test
    void rolling20TimesWithNoPinsKnockedDownShouldReturnScoreZero() {
        multipleRoll(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    void rolling20TimesWithOnePinsKnockedDownShouldReturnScore20() {
        multipleRoll(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    void spareTest() {
        game.roll(5);
        game.roll(5);
        game.roll(2);
        multipleRoll(17, 0);

        assertEquals(14, game.score());

    }

    @Test
    void spareInLastRoundTest() {
        multipleRoll(18, 0);
        game.roll(5);
        game.roll(5);
        game.roll(2);

        assertEquals(12, game.score());

    }

    @Test
    void strikeTest() {
        game.roll(10);
        game.roll(5);
        game.roll(2);

        multipleRoll(16, 0);

        assertEquals(24, game.score());

    }


    private void multipleRoll(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

}


