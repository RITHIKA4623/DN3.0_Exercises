public class DecoratorPatternExample {

    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        String message = "You have a new notification!";

        // Send notification via Email
        emailNotifier.send(message);
        System.out.println();

        // Send notification via Email and SMS
        smsNotifier.send(message);
        System.out.println();

        // Send notification via Email, SMS, and Slack
        slackNotifier.send(message);
    }
}
