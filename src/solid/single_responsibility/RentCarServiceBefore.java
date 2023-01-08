package solid.single_responsibility;

public class RentCarServiceBefore {
    public String findCar(String carNo) {
        //find car by number
        return "car_" + carNo;
    }

    public String orderCar(String carNo, String client) {
        //client order car
        return "order_" + carNo;
    }

    public void printOrder(String order) {
        System.out.println(order);
    }

    @SuppressWarnings("DuplicatedCode")
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            System.out.println("sedan");
            return;
        }
        if (carType.equals("pickup")) {
            System.out.println("pickup");
            return;
        }
        if (carType.equals("van")) {
            System.out.println("van");
        }
    }

    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            System.out.println(message);
            //write email
            //use JavaMailSenderAPI
        }
    }
}
