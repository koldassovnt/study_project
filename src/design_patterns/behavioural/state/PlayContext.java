package design_patterns.behavioural.state;

public class PlayContext implements State {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
