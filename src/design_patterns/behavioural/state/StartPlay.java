package design_patterns.behavioural.state;

public class StartPlay implements State {
    @Override
    public void doAction() {
        System.out.println("start play");
    }
}
