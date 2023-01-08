package design_patterns.behavioural.command;

public class StopCar implements Command {
    private final Car car;

    public StopCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }
}
