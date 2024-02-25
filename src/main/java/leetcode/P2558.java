package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class P2558 {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
        for (int gift : gifts) queue.offer(gift);
        int count = 0;
        while (!queue.isEmpty() && count<k) {
            int curr = queue.poll();
            int root = (int)Math.sqrt(curr);
            queue.offer(root);
            count++;
        }
        long sum = 0;
        while (!queue.isEmpty()) sum += queue.poll();
        return sum;
    }
}
