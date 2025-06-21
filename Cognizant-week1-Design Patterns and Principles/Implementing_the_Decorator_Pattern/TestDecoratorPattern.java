package Implementing_the_Decorator_Pattern;

public class TestDecoratorPattern {
    public static void main(String[] args) {

        Notifier baseNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);

        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("== Sending multi-channel notification ==");
        fullNotifier.send("Your account has been accessed from a new device.");
    }
}
