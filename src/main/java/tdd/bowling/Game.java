package tdd.bowling;

public class Game {
    int totalScore = 0;
    private final int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pinsKnockedDown) {
        totalScore += pinsKnockedDown;
        rolls[currentRoll++] = pinsKnockedDown;
    }

    public int score() {
        int score = 0;
        for (int frame = 0; frame < 20; frame++) {
            score += rolls[frame];
            score += calculateBonus(frame);
        }
        return score;
    }

    private int calculateBonus(int frame) {
        if (isSpare(frame))
            return rolls[frame + 2];

        return 0;


    }

    private boolean isSpare(int frame) {
        return frame % 2 == 0 && rolls[frame] + rolls[frame + 1] == 10;
    }

}