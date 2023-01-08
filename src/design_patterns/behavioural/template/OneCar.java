package design_patterns.behavioural.template;

public class OneCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Start engine.");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop engine.");
    }
}
