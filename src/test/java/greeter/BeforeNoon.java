package greeter;

import java.time.LocalTime;
//en Stub implementation
//Detta är en test double implementation som för kör en tid före 12
public class BeforeNoon implements TimeProvider {
    @Override
    public LocalTime currentTime() {
        return LocalTime.of(10,15);
    }
}
