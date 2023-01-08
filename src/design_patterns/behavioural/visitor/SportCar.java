package design_patterns.behavioural.visitor;

public class SportCar implements Car {

    private final Car[] cars;

    public SportCar() {
        cars = new Car[]{new Engine(), new Wheel()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Car car : cars) {
            car.accept(visitor);
        }
        visitor.visit(this);
    }
}
