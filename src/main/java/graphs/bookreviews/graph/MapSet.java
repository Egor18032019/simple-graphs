package graphs.bookreviews.graph;

import java.util.*;

public class MapSet<TKey, TValue> {

    private final Map<TKey, Set<TValue>> map;

    public MapSet() {
        map = new HashMap<>();
    }

    public void put(final TKey key, final TValue value) {
        map.computeIfAbsent(key, k -> new HashSet<>());
        map.get(key).add(value);
    }

    public Set<TValue> get(final TKey key) {
        return map.getOrDefault(key, Collections.emptySet());
    }
}
