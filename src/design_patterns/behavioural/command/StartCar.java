package design_patterns.behavioural.command;

public class StartCar implements Command {
    private final Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
