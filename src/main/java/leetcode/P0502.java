package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class P0502 {
    static class Prj {
        int profit = 0;
        int capital = 0;
        Prj (int p, int c) {
            this.profit = p;
            this.capital = c;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Queue<Prj> pq1 = new PriorityQueue<>((a, b) -> a.capital - b.capital);
        for (int i = 0; i < profits.length; i++) {
            pq1.add(new Prj(profits[i], capital[i]));
        }
        Queue<Integer> pq2 = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; i++) {
            while (!pq1.isEmpty() && pq1.peek().capital <= w) {
                pq2.add(pq1.poll().profit);
            }
            if (pq2.isEmpty()) {
                break;
            }
            w += pq2.poll();
        }
        return w;
    }
}
