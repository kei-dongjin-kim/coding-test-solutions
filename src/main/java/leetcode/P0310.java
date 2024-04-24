package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);

        List<Integer>[] graph = new List[n];
        int[] degree = new int[n];
        for (int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Create graph and degree
        // degree[i] = number of edges connected to node i
        // graph[i] = list of nodes connected to node i
        // For example, if edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
        // degree = [1, 1, 1, 4, 2, 1]
        // graph = [[3], [3], [3], [0, 1, 2, 4], [3, 5], [4]]
        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        // Find leaves
        List<Integer> leaves = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (degree[i] == 1) {
                leaves.add(i);
            }
        }

        // Remove leaves until there are 2 or less nodes left
        // The remaining nodes are the roots of the minimum height trees
        while (n > 2) {
            // Remove leaves
            n -= leaves.size();
            // Create new leaves
            List<Integer> newLeaves = new ArrayList<>();
            // For each leaf, remove the leaf from the graph and decrease the degree of the neighbor
            // If the degree of the neighbor is 1, add the neighbor to the new leaves
            for (int leaf : leaves) {
                for (int neighbor : graph[leaf]) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        newLeaves.add(neighbor);
                    }
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
