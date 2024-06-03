package grokaem_algo_book.graph.dijkstra;

public class Node implements Comparable<Node> {
    String vertex;
    int distance;

    public Node(String vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}