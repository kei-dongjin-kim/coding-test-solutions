package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class P0826 {
    static class ProfitInfo {
        int difficulty = 0;
        int profit = 0;
        ProfitInfo(int d, int p) {
            this.difficulty = d;
            this.profit = p;
        }
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum = 0;
        Queue<ProfitInfo> list = new PriorityQueue<>((a, b) -> b.profit - a.profit);
        for (int i=0 ; i<profit.length ; i++) {
            list.add(new ProfitInfo(difficulty[i], profit[i]));
        }
        Arrays.sort(worker);
        ProfitInfo p = null;
        int i = worker.length - 1;
        while (!list.isEmpty()) {
            p = list.poll();
            while (i >= 0) {
                if (p.difficulty <= worker[i]) {
                    sum += p.profit;
                    i--;
                } else {
                    break;
                }
            }
        }
        return sum;
    }
}
