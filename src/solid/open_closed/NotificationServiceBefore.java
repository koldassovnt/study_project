package solid.open_closed;

public class NotificationServiceBefore {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            System.out.println(message);
            //write email
            //use JavaMailSenderAPI
            return;
        }
        if (typeMessage.equals("sms")) {
            System.out.println(message);
            //write sms
            //send sms
        }
    }
}
