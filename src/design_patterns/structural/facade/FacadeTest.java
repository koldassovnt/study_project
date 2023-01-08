package design_patterns.structural.facade;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();

        System.out.println();

        facade.stopCar();
    }
}
