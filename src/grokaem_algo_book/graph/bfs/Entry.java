package grokaem_algo_book.graph.bfs;

import java.util.ArrayList;
import java.util.List;

public class Entry {
    public String name;
    List<Edge> edges = new ArrayList<>();

    public static Entry of(String name) {
        Entry entry = new Entry();
        entry.name = name;

        return entry;
    }
}
