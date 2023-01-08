package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Car {

    private final List<Car> cars = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Car car : cars) {
            car.draw(color);
        }
    }

    public void add(Car s) {
        this.cars.add(s);
    }

    public void clear() {
        System.out.println();
        this.cars.clear();
    }
}
