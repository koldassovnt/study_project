package consumer_predicate_supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    /**
     * A Consumer is an in-built functional interface introduced in Java8.
     * Consumer can be used in all contexts where an Object needs to be consumed i.e,
     * taken as input and some operation is to be performed on the Object without returning any result.
     * (OR) A Consumer is a functional interface that accepts a single input and returns no output.
     * As the name suggests the implementation of this interface consumes the input supplied to it.
     */

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("chicken", 180));
        items.add(new Item("pizza", 150));
        items.add(new Item("burger", 70));
        items.add(new Item("chips", 50));

        Consumer<Item> consumer = (c) ->
                System.out.println(c.getItemName().toUpperCase());

        System.out.println("Without lambda expression\n");
        items.forEach(consumer);

        System.out.println("\nWith lambda expression\n");
        items.forEach(item -> System.out.println(item.getItemName().toUpperCase()));
    }
}
