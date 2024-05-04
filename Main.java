public class Main {
    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList();
        
        adjacencyList.addEdge('A', 'E');
        adjacencyList.addEdge('A', 'D');
        adjacencyList.addEdge('A', 'B');
        adjacencyList.addEdge('B', 'E');
        adjacencyList.addEdge('C', 'B');
        adjacencyList.addEdge('D', 'G');
        adjacencyList.addEdge('E', 'H');
        adjacencyList.addEdge('E', 'F');
        adjacencyList.addEdge('F', 'C');
        adjacencyList.addEdge('F', 'H');
        adjacencyList.addEdge('G', 'H');
        adjacencyList.addEdge('H', 'I');
        adjacencyList.addEdge('I', 'F');
    
        System.out.println("BFS: ");
        BFS bfs = new BFS(adjacencyList);
        bfs.search('A');

        System.out.println();

        System.out.println("DFS: ");
        DFS dfs = new DFS(adjacencyList);
        dfs.search('A');
    }
}