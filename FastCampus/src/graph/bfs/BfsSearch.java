package graph.bfs;

import graph.UndirectedGraph;

import java.util.ArrayList;

public class BfsSearch {

    int count;
    boolean[] visited;
    ArrayList<Integer> queue;
    int[][] matrix;

    public BfsSearch(int count) {
        this.count = count;
        visited = new boolean[count];
        queue = new ArrayList<>(count);
    }

    private void bfsTraversal() {
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.remove(0);
            System.out.print(node + " ");

            for (int i = 0; i < count; i++) {
                if (matrix[node][i] != 0 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int count = 8;
        UndirectedGraph graph = new UndirectedGraph(count);

        graph.addEdge(0,1,1);
        graph.addEdge(0,2,1);
        graph.addEdge(1,3,1);
        graph.addEdge(1,4,1);
        graph.addEdge(2,5,1);
        graph.addEdge(2,6,1);
        graph.addEdge(3,7,1);
        graph.addEdge(4,5,1);

        BfsSearch bfsSearch = new BfsSearch(count);
        bfsSearch.matrix = graph.getVertexMatrix();

        bfsSearch.bfsTraversal();
    }

}
