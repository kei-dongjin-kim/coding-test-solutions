package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class P1636 {
    static class Pair {
        int key;
        int freq;
        Pair (int key, int freq) {
            this.key = key;
            this.freq = freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        Queue<Pair> q = new PriorityQueue<Pair>((a, b) -> {
            int cmp = Integer.compare(a.freq, b.freq);
            if (cmp == 0) {
                return Integer.compare(b.key, a.key);
            }
            return cmp;
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            q.add(new Pair(entry.getKey(), entry.getValue()));
        }
        int[] result = new int[nums.length];
        int idx = 0;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i=0 ; i<p.freq ; i++) {
                result[idx++] = p.key;
            }
        }
        return result;
    }
}
