package grokaem_algo_book.graph;

public class Edge {
    public int km;
    public Entry toEntry;

    public static Edge of(int km, Entry toEntry) {
        Edge edge = new Edge();
        edge.km = km;
        edge.toEntry = toEntry;

        return edge;
    }

}
