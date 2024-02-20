package leetcode;

import java.util.Queue;
import java.util.PriorityQueue;

public class P1337 {
    private static class Pair {
        int index;
        int count;
        Pair(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<Pair> queue = new PriorityQueue<>((a, b) -> a.count == b.count ? a.index - b.index : a.count - b.count);
        for (int i=0 ; i<mat.length ; i++ ) {
            int count = 0;
            for (int j=0 ; j<mat[i].length ; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            queue.add(new Pair(i, count));
        }
        int[] result = new int[k];
        for (int i=0 ; i<k ; i++) {
            if (!queue.isEmpty())
                result[i] = queue.poll().index;
        }
        return result;
    }
}
