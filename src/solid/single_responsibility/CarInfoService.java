package solid.single_responsibility;

public class CarInfoService {

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
}
