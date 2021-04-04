package Graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(8, 9);
        graph.addEdge(9, 1);
        graph.addEdge(5, 3);
        BreadthFirstPath breadthFirstPath = new BreadthFirstPath(graph, 1);
        System.out.println(breadthFirstPath.pathTo(9).toString());


    }
}
