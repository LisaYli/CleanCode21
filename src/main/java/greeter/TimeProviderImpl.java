package greeter;

import java.time.LocalTime;

public class TimeProviderImpl implements TimeProvider {
    @Override
    public LocalTime currentTime() {
        return LocalTime.now();
    }

    public static void main(String[] args) {
        TimeProviderImpl timeProviderImpl = new TimeProviderImpl();
        Greeter greeter = new Greeter(timeProviderImpl);
        System.out.println(greeter.greet() + " the time is: " + timeProviderImpl.currentTime());

    }
}
