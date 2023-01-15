package consumer_predicate_supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    /**
     * This Functional Interface is used in all contexts where there is no input but an output is expected.
     */

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Shawarma", 140));
        items.add(new Item("chips", 530));
        items.add(new Item("chicken", 650));
        items.add(new Item("pizza", 250));
        items.add(new Item("burger", 770));
        items.add(new Item("French Fries", 570));

        //Returning an Item with no valid data
        Supplier<Item> supplier = () -> new Item("Dummy", 0);

        System.out.println(items.stream().filter(item ->
                item.getPrice() > 1000).findAny().orElseGet(supplier));

    }
}
