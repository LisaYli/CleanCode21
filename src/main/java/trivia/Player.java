package trivia;

public class Player {
    private final String name;
    private int place = 0;
    private int coins = 0;

    Player(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public int place() {
        return place;
    }

    public void move(int roll) {
        place += roll;
        if (place >= 12) {
            place -= 12;
        }
    }

    public void addCoin() {
        coins++;
    }

    public int coins() {
        return coins;
    }
}