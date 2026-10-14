package Problem5after;

public class EmailNotifier implements  Notifier{

    @Override
    public void notify(String to, String message) {
        System.out.printf("Email sent to %s: %s%n",to,message);
    }
}
