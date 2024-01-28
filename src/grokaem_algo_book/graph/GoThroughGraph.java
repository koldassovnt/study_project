package grokaem_algo_book.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GoThroughGraph {

    public boolean isThereWay(List<Edge> edges, Entry cityTo) {

        boolean res = false;

        List<Edge> nextCheck = new ArrayList<>();

        for (Edge edge : edges) {
            if (Objects.equals(edge.toEntry.name, cityTo.name)) {
                res = true;
                break;
            } else {
                nextCheck.addAll(edge.toEntry.edges);
            }
        }

        if (!nextCheck.isEmpty() && !res) {
            return isThereWay(nextCheck, cityTo);
        }

        return res;

    }

    public static void main(String[] args) {

        Entry almaty = Entry.of("Almaty");
        Entry taldykorgan = Entry.of("Taldykorgan");
        Entry shu = Entry.of("Shu");
        Entry taraz = Entry.of("Taraz");
        Entry oskemen = Entry.of("Oskemen");

        Entry aktau = Entry.of("Aktau");
        Entry aktobe = Entry.of("Aktobe");

        aktau.edges.add(Edge.of(78, aktobe));

        almaty.edges.add(Edge.of(120, taldykorgan));
        almaty.edges.add(Edge.of(80, shu));

        shu.edges.add(Edge.of(50, taraz));

        taldykorgan.edges.add(Edge.of(600, oskemen));

        GoThroughGraph graph = new GoThroughGraph();

        boolean thereWayToTaraz = graph.isThereWay(almaty.edges, taraz);

        System.out.println("bXABNlpK :: Is there way from " + almaty.name + " to " + taraz.name + " = " + thereWayToTaraz);

        boolean thereWayToAktau = graph.isThereWay(almaty.edges, aktau);

        System.out.println("0I6erUws :: Is there way from " + almaty.name + " to " + aktau.name + " = " + thereWayToAktau);

    }

}
