import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BFS {
    private Queue<Character> toBeSearched;
    private AdjacencyList adjacencyList;
    private Map<Character, Boolean> visited;

    public BFS(AdjacencyList adjacencyList) {
        this.adjacencyList = adjacencyList;
        this.visited = new HashMap<>();
        this.toBeSearched = new LinkedList<>();
    }

    public void search(char start) {
        toBeSearched.add(start);

        while (!toBeSearched.isEmpty()) {
            char current = toBeSearched.poll();

            if (visited.containsKey(current) && visited.get(current)) {
                continue;
            }

            System.out.print(current + "->");
            visited.put(current, true);

            for (char neighbor : adjacencyList.getNeighbors(current)) {
                if (!visited.getOrDefault(neighbor, false)) {
                    toBeSearched.add(neighbor);
                }
            }
        }
    }
}
