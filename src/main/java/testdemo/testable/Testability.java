package testdemo.testable;

import java.util.Random;

public class Testability {

    public static void main(String[] args) {
        try {
            Logger.log(LogLevel.WARNING, "Some warning - program is starting up or whatever");
            MailSender.sendMail("some-invalid-email-address.com", "Program has started.");
        } catch (IllegalArgumentException ex) {
            Logger.log(LogLevel.ERROR, "An error occured: " + ex);
        }
    }
}

