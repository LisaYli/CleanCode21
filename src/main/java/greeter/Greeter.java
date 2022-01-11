package greeter;

import java.time.LocalTime;

public class Greeter {
private final TimeProvider timeProvider;

    public Greeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String greet() {
        if (timeProvider.currentTime().getHour() < 12)
            return "God morgon.";
        else
            return "God dag.";
    }
}
