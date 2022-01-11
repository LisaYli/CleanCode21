package greeter;

import java.time.LocalTime;

public class AfterNoon implements TimeProvider {
    @Override
    public LocalTime currentTime() {
        return LocalTime.of(15,00);
    }
}
