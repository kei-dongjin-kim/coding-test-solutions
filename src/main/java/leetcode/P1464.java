package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class P1464 {
    public int maxProduct(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
        for (int num : nums) queue.offer(num);
        return (queue.poll() - 1) * (queue.poll() -1);
    }
}
