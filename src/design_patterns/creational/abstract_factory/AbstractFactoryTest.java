package design_patterns.creational.abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String country = "UA";
        InteAbsFactory ifactory = null;

        if ("UA".equals(country)) {
            ifactory = new UaCarPriceAbsFactory();
        } else if (country.equals("RU")) {
            ifactory = new RuCarPriceAbsFactory();
        }

        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());
    }
}
