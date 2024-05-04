import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DFS {
    private Stack<Character> toBeSearched;
    private AdjacencyList adjacencyList;
    private Map<Character, Boolean> visited;

    public DFS(AdjacencyList adjacencyList) {
        this.toBeSearched = new Stack<>();
        this.adjacencyList = adjacencyList;
        this.visited = new HashMap<>();
    }

    public void search(char start) {
        toBeSearched.push(start);

        while (!toBeSearched.isEmpty()) {
            char current = toBeSearched.pop();

            if (visited.containsKey(current) && visited.get(current)) {
                continue;
            }

            System.out.print(current + "->");
            visited.put(current, true);

            for (char neighbor : adjacencyList.getNeighbors(current)) {
                if (!visited.getOrDefault(neighbor, false)) {
                    toBeSearched.push(neighbor);
                }
            }
        }
    }
}
