package grokaem_algo_book.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class GreedyAlgoExample {

    public static void main(String[] args) {

        Set<String> statesNeeded = new HashSet<>(Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

        Map<String, Set<String>> stations = new HashMap<>();

        stations.put("kone", Set.of("id", "nv", "ut"));
        stations.put("ktwo", Set.of("wa", "id", "mt"));
        stations.put("kthree", Set.of("or", "nv", "ca"));
        stations.put("kfour", Set.of("nv", "ut"));
        stations.put("kfive", Set.of("ca", "az"));

        List<String> finalStations = new ArrayList<>();

        while (!statesNeeded.isEmpty()) {

            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> stationEntry : stations.entrySet()) {

                Set<String> covered = statesNeeded
                        .stream()
                        .filter(x -> stationEntry.getValue().contains(x))
                        .collect(Collectors.toSet());

                if (covered.size() > statesCovered.size()) {
                    bestStation = stationEntry.getKey();
                    statesCovered = covered;
                }

            }

            for (String s : statesCovered) {
                statesNeeded.remove(s);
            }

            finalStations.add(bestStation);

        }

        System.out.println(finalStations);

    }

}
