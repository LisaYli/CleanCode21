package trivia;

import java.util.ArrayList;
import java.util.List;


public class Game implements IGame {
    private final List<Player> players = new ArrayList<>();

    private int currentPlayer = 0;
    private boolean isGettingOutOfPenaltyBox;
    private final Question questions = new Question();

    public Game() {}

    public void add(String playerName) {
        players.add(new Player(playerName));
        System.out.println(playerName + " was added");
        System.out.println("They are player number " + players.size());
    }

    public void roll(int roll) {
        System.out.println(currentPlayer().name() + " is the current player");
        System.out.println("They have rolled a " + roll);

        if (currentPlayer().isInPenaltyBox()) {
            if (roll % 2 != 0) {
                isGettingOutOfPenaltyBox = true;

                System.out.println(currentPlayer().name() + " is getting out of the penalty box");
                currentPlayer().move(roll);
                System.out.println(currentPlayer().name() + "'s new location is " + currentPlayer().place());
                System.out.println("The category is " + questions.currentCategory(currentPlayer().place()).getLabel());
                askQuestion();
            } else {
                System.out.println(currentPlayer().name() + " is not getting out of the penalty box");
                isGettingOutOfPenaltyBox = false;
            }

        } else {
            currentPlayer().move(roll);

            System.out.println(currentPlayer().name() + "'s new location is " + currentPlayer().place());
            System.out.println("The category is " + questions.currentCategory(currentPlayer().place()).getLabel());
            askQuestion();
        }

    }

    private void askQuestion() {
        System.out.println(questions.extractNextQuestion(currentPlayer().place()));
    }


    private Player currentPlayer() {
        return players.get(currentPlayer);
    }

    public boolean wasCorrectlyAnswered() {

        if (currentPlayer().isInPenaltyBox()) {
            if (isGettingOutOfPenaltyBox) {
                System.out.println("Answer was correct!!!!");
                // TODO possible bug: shouldn't you exit the penalty box here ?
                //  email the biz: in case he's about to exit from pen box and correct answer
                currentPlayer().addCoin();
                System.out.println(currentPlayer().name() + " now has " + currentPlayer().coins() + " Gold Coins.");
                boolean winner = didPlayerWin();
                currentPlayer++;
                if (currentPlayer == players.size()) currentPlayer = 0;

                return winner;
            } else {
                currentPlayer++;
                if (currentPlayer == players.size()) currentPlayer = 0;
                return true;
            }

        } else {
            System.out.println("Answer was corrent!!!!");
            currentPlayer().addCoin();
            System.out.println(currentPlayer().name()
                    + " now has "
                    + currentPlayer().coins()
                    + " Gold Coins.");

            boolean winner = didPlayerWin();
            currentPlayer++;
            if (currentPlayer == players.size()) currentPlayer = 0;

            return winner;
        }
    }

    public boolean wrongAnswer() {
        System.out.println("Question was incorrectly answered");
        System.out.println(currentPlayer().name() + " was sent to the penalty box");
        currentPlayer().moveToPenaltyBox();

        currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
        return true;
    }


    private boolean didPlayerWin() {
        return !(currentPlayer().coins() == 6);
    }
}
/*
 * extracted method (replace duplicate code)
 * Inline
 * renamed
 * baby steps: don't break compilation at any moment while refactoring
 * Move Method --> Player.move(roll) -- with invariants
 * switch [expression]: 1) one lines/case, 2) default 3) no extra code in that method
 * Alt-J
 * Any field ypu create let it be private final at the start. NOT creating getters and setters.
   If you need to create them, create them individually.
 * records - immutable structs
 */