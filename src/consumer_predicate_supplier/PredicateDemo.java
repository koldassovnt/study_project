package consumer_predicate_supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    /**
     * This Functional Interface is used for conditional check.
     * It represents a boolean-valued-function of an argument.
     * This is mainly used to filter data from a Java Stream.
     */

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("chicken", 650));
        items.add(new Item("pizza", 250));
        items.add(new Item("burger", 770));
        items.add(new Item("chips", 530));
        items.add(new Item("French Fries", 570));
        items.add(new Item("Shawarma", 140));

        //Returns true if item price is > 500
        Predicate<Item> pFI = (item) -> item.getPrice() > 500;
        items.stream().filter(pFI).forEach(System.out::println);
    }
}
