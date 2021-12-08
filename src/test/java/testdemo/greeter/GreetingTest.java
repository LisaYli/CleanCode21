package testdemo.greeter;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {


    @Test
    void callingGreetWithNameBobShouldReturnHelloBob(){
        Greeting greeting = new Greeting();
        String answer = greeting.greet("Bob");
        assertEquals("Hello, Bob.", answer);
    }

    @Test
    void callingGreetWithNameMartinShouldReturnHelloMartin(){
        Greeting greeting = new Greeting();
        String answer = greeting.greet("Martin");
        assertEquals("Hello, Martin.", answer);
    }

    @Test
    void callingGreetWithNullAsNameShouldReturnHelloMyFriend(){
        Greeting greeting = new Greeting();
        String answer = greeting.greet(null);
        assertEquals("Hello, my friend.", answer);
    }

    @Test
    @DisplayName("Calling greet with uppercase NAME should return HELLO NAME!")
    void callingGreetWithNAMEUppercaseShouldReturnHELLONAME(){
        Greeting greeting = new Greeting();
        String answer = greeting.greet("ANNA");
        assertEquals("HELLO ANNA!", answer);
    }




}
