package greeter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    Greeter greeter;
    TimeProvider timeProvider;
    @Test
    void givenATimeBefore12ReturnGodMorgon() {
        timeProvider = new BeforeNoon();
        greeter = new Greeter(timeProvider);
        assertThat(greeter.greet()).isEqualTo("God morgon.");
    }

    @Test
    void givenATimeAfter12ReturnGodDag() {
        // mockar interfacet timeProvider
        timeProvider = Mockito.mock(TimeProvider.class);
        Mockito.when(timeProvider.currentTime()).thenReturn(LocalTime.of(12,30));
        greeter = new Greeter(timeProvider);
        assertThat(greeter.greet()).isEqualTo("God dag.");
    }


    @Test
    void givenATimeAfter18ReturnGodKvall() {
        timeProvider = Mockito.mock(TimeProvider.class);
        Mockito.when(timeProvider.currentTime()).thenReturn(LocalTime.of(18,30));
        greeter = new Greeter(timeProvider);
        assertThat(greeter.greet()).isEqualTo("God kväll.");
    }


}
