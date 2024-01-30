package grokaem_algo_book.graph.bfs;

import java.util.*;

public class MapUsingGraphRealization {

    public boolean searchFirstNameStartWithM(Map<String, List<String>> contacts, String startName) {

        Deque<List<String>> deque = new ArrayDeque<>();

        deque.add(contacts.get(startName));

        List<String> searched = new ArrayList<>();

        while (!deque.isEmpty()) {

            System.out.println("SoE7ESn3 :: deque = " + deque);

            List<String> firstOrder = deque.getFirst();
            deque.removeFirst();

            for (String contact : firstOrder) {

                if (!searched.contains(contact)) {

                    if (contact.toLowerCase().endsWith("m")) {
                        System.out.println("Q1oIEoV9 :: " + contact + " is ending with m letter");
                        return true;
                    } else {
                        deque.add(contacts.get(contact));
                        searched.add(contact);
                    }

                }

            }

        }

        return false;

    }

    public static void main(String[] args) {

        Map<String, List<String>> contacts = new HashMap<>();

        contacts.put("you", List.of("alice", "bob", "claire"));
        contacts.put("bob", List.of("anuj", "peggy"));
        contacts.put("alice", List.of("peggy"));
        contacts.put("claire", List.of("thom", "johnny"));
        contacts.put("anuj", List.of());
        contacts.put("peggy", List.of());
        contacts.put("thom", List.of());
        contacts.put("jonny", List.of());

        MapUsingGraphRealization graph = new MapUsingGraphRealization();

        boolean contactEndWithM = graph.searchFirstNameStartWithM(contacts, "you");

        System.out.println("3G6u22wc :: " + contactEndWithM);

    }

}
