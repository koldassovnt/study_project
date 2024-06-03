package grokaem_algo_book.graph.dijkstra;

import java.util.*;

public class DijkstraExample {

    public static void main(String[] args) {
        // Creating the graph as a HashMap
        Map<String, List<Node>> graph = new HashMap<>();

        // Adding edges (airports and travel times)
        graph.put("JFK", Arrays.asList(new Node("LAX", 6), new Node("ORD", 2)));
        graph.put("LAX", Arrays.asList(new Node("JFK", 6), new Node("SFO", 1), new Node("ORD", 4)));
        graph.put("ORD", Arrays.asList(new Node("JFK", 2), new Node("LAX", 4), new Node("ATL", 3)));
        graph.put("SFO", Arrays.asList(new Node("LAX", 1), new Node("SEA", 2)));
        graph.put("ATL", Arrays.asList(new Node("ORD", 3), new Node("MIA", 5)));
        graph.put("SEA", Arrays.asList(new Node("SFO", 2), new Node("DEN", 4)));
        graph.put("MIA", List.of(new Node("ATL", 5)));
        graph.put("DEN", List.of(new Node("SEA", 4)));

        // Starting airport
        String source = "JFK";

        // Running Dijkstra's algorithm
        dijkstra(graph, source);
    }

    // Function to implement Dijkstra's algorithm
    public static void dijkstra(Map<String, List<Node>> graph, String source) {
        // Distance map to store the shortest distance to each vertex
        Map<String, Integer> dist = new HashMap<>();
        // Priority queue for the nodes to explore
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // Set to track visited nodes
        Set<String> visited = new HashSet<>();

        // Initialize distances to infinity, and source distance to 0
        for (String vertex : graph.keySet()) {
            dist.put(vertex, Integer.MAX_VALUE);
        }
        dist.put(source, 0);

        // Add the source node to the priority queue
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            // Get the node with the smallest distance
            Node currentNode = pq.poll();
            String u = currentNode.vertex;

            // If the node has already been visited, skip it
            if (visited.contains(u)) continue;
            visited.add(u);

            // Check all adjacent nodes
            for (Node neighbor : graph.get(u)) {
                String v = neighbor.vertex;
                int weight = neighbor.distance;
                int newDist = dist.get(u) + weight;

                if (newDist < dist.get(v)) {
                    dist.put(v, newDist);
                    pq.add(new Node(v, newDist));
                }
            }
        }

        // Print the shortest distances
        System.out.println("Airport \t Distance from Source");
        for (Map.Entry<String, Integer> entry : dist.entrySet()) {
            System.out.println(entry.getKey() + " \t\t " + entry.getValue());
        }
    }
}
