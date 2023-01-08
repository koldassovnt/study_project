package solid.single_responsibility;

public class CarService {
    public String findCar(String carNo) {
        //find car by number
        return "car_" + carNo;
    }
}
