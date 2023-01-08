package design_patterns.structural.facade;

public class Facade {
    private final Key key;
    private final Engine engine;

    public Facade() {
        key = new Key();
        engine = new Engine();
    }

    public void startCar() {
        key.insertKey();
        engine.runEngine();
    }

    public void stopCar() {
        key.pullOutKey();
        engine.downEngine();
    }
}
