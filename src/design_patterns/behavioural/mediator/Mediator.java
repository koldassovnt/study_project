package design_patterns.behavioural.mediator;

public class Mediator {
    public static void sendMessage(User user, String msg){
        System.out.println(user.name() + ": " + msg);
    }
}
