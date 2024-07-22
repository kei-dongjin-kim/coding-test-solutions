package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class P2418 {
    static class Pair {
        String name;
        int height;
        Pair(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;
        Queue<Pair> q = new PriorityQueue<Pair>((a, b) -> b.height - a.height);
        for (int i=0 ; i<len ; i++) {
            q.add(new Pair(names[i], heights[i]));
        }
        String[] sorted = new String[len];
        for (int i=0 ; i<len ; i++) {
            Pair curr = q.poll();
            sorted[i] = curr.name;
        }
        return sorted;
    }
}
