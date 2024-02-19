package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P2099 {
    public int[] maxSubsequence(int[] nums, int k) {
        Queue<Integer> queue1 = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);
        Queue<Integer> queue2 = new PriorityQueue<>((a, b) -> a - b);
        for (int i=0 ; i<nums.length ; i++) {
            queue1.offer(i);
        }
        int j=0;
        while (!queue1.isEmpty() && j<k) {
            queue2.offer(queue1.poll());
            j++;
        }
        int[] result = new int[k];
        int x=0;
        while (!queue2.isEmpty()) {
            result[x] = nums[queue2.poll()];
            x++;
        }
        return result;
    }
}
