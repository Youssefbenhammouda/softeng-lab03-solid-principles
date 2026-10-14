package Problem5after;

public class SmsNotifier implements Notifier {


    @Override
    public void notify(String to, String message) {
        System.out.printf("SMS sent to %s: %s%n",to,message);
    }
}
