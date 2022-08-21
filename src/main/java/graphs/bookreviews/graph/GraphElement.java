package graphs.bookreviews.graph;

import java.util.HashMap;
import java.util.Map;

// У GraphElement есть метка и набор свойств
public class GraphElement {
    public final String label;
    public final Map<String, Object> properties = new HashMap<>();

    public GraphElement(String label) {
        this.label = label;
    }
}