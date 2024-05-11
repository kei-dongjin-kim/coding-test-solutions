package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P0857 {
    class Worker {
        double ratio = 0d;
        int quality = 0;
        Worker (int q, int w) {
            this.ratio = (double) w / q;
            this.quality = q;
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        Queue<Worker> q1 = new PriorityQueue<Worker>(Comparator.comparingDouble(a -> a.ratio));
        for (int i=0 ; i<wage.length ; i++) {
            q1.add(new Worker(quality[i], wage[i]));
        }
        Queue<Worker> q2 = new PriorityQueue<Worker>((a, b) -> b.quality - a.quality);
        int sum = 0;
        double result = Double.MAX_VALUE;
        while (!q1.isEmpty()) {
            Worker worker = q1.poll();
            sum += worker.quality;
            q2.add(worker);
            if (q2.size() > k) {
                sum -= q2.poll().quality;
            }
            if (q2.size() == k) {
                result = Math.min(result, sum * worker.ratio);
            }
        }
        return result;
    }
}
