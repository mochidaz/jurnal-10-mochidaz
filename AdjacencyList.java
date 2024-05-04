import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
    private Map<Character, List<Character>> adjacencyList;

    public AdjacencyList() {
        adjacencyList = new HashMap<>();
    }

    private void addVertex(char vertex) {
        adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(Character source, Character destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }

        adjacencyList.get(source).add(destination);
    }

    public List<Character> getNeighbors(char vertex) {
        return adjacencyList.get(vertex);
    }
}
