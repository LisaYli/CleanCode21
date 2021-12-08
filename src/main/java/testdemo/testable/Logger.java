package testdemo.testable;

public class Logger {
    public static void log(LogLevel logLevel, String logText) {
        System.out.println(logLevel + ": " + logText);

        if (logLevel == LogLevel.ERROR) {
            //send e-mail about error
            MailSender.sendMail("kalle.anka@ankeborg.se", logText);
        }
    }
}
