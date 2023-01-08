package design_patterns.structural.decorator;

public class UnknownCar implements Car {
    @Override
    public void draw() {
        System.out.println("UnknownCar");
    }
}
