package design_patterns.behavioural.command;

public class CommandTest {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);

        CarInvoker carInvoker = new CarInvoker(startCar);
        carInvoker.execute();

        carInvoker = new CarInvoker(stopCar);
        carInvoker.execute();
    }
}
