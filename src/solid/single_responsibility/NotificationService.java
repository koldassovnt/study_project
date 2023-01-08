package solid.single_responsibility;

public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            System.out.println(message);
            //write email
            //use JavaMailSenderAPI
        }
    }
}
