package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class P1046 {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
        for (int stone : stones) queue.offer(stone);
        while(!queue.isEmpty() && queue.size() > 1) {
            int val1 = queue.poll();
            int val2 = queue.poll();
            if (val1 == val2) continue;
            else queue.offer(val1 - val2);
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
