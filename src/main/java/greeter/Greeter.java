package greeter;

import java.time.LocalTime;

public class Greeter {
private final TimeProvider timeProvider;

    public Greeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String greet() {
        var timeCheck = timeProvider.currentTime().getHour();
        if (timeCheck < 12)
            return "God morgon.";
        else if (timeCheck >= 18)
            return "God kväll.";
        else
            return "God dag.";

    }
}
