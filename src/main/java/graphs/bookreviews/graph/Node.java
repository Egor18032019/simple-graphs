package graphs.bookreviews.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
// Node является GraphElement с входящими и исходящими рёбрами
public class Node extends GraphElement {

    public final String id;
    public final List<Edge> outgoingEdges;
    public final List<Edge> incomingEdges;

    public Node(final String id, final String label) {
        super(label);
        this.id = id;

        outgoingEdges = new ArrayList<>();
        incomingEdges = new ArrayList<>();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Node node = (Node) o;
        return Objects.equals(id, node.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Node{" +
                "label='" + label + '\'' +
                ", id='" + id + '\'' +
                ", properties=" + properties +
                '}';
    }

    void addOutgoingEdge(final Edge r) {
        outgoingEdges.add(r);
    }

    void addIncomingEdge(final Edge r) {
        incomingEdges.add(r);
    }

    Stream<Edge> outgoingEdges() {
        return outgoingEdges.stream();
    }

    Stream<Edge> outgoingEdges(final String edgeLabel) {
        return outgoingEdges.stream().filter(e -> e.label.equals(edgeLabel));
    }

    Stream<Edge> incomingEdges() {
        return incomingEdges.stream();
    }

    Stream<Edge> incomingEdges(final String edgeLabel) {
        return incomingEdges.stream().filter(e -> e.label.equals(edgeLabel));
    }

}