package solid.single_responsibility;

public class RentCarServiceAfter {
    public String orderCar(String carNo, String client) {
        //client order car
        return "order_" + carNo;
    }
}
