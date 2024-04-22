package leetcode;

import java.util.*;

public class P1971 {
    private final Map<Integer, Set<Integer>> map = new HashMap<>();
    private Boolean[] visited;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        visited = new Boolean[n];
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], k -> new HashSet<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new HashSet<>()).add(edge[0]);
        }
        return trace(n-1, source, destination);
    }

    public boolean trace(int n, int s, int d) {
        if (n < 0) return false;
        if (visited[s] != null) return visited[s];
        if (s == d) return true;
        visited[s] = false;
        Set<Integer> list = map.get(s);
        if (list != null) {
            for (Integer i : list) {
                if (trace(n-1, i, d)) {
                    visited[s] = true;
                    break;
                }
            }
        }
        return visited[s];
    }
}
