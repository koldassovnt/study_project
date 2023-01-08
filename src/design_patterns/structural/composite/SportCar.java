package design_patterns.structural.composite;

public class SportCar implements Car {

    @Override
    public void draw(String color) {
        System.out.println("SportCar color: " + color);
    }
}
