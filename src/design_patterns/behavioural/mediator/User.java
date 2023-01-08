package design_patterns.behavioural.mediator;

public record User(String name) {
    public void sendMessage(String msg) {
        Mediator.sendMessage(this, msg);
    }
}
