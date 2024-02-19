package leetcode;

import java.util.PriorityQueue;

public class P0703 {
    private static int k;
    private PriorityQueue<Integer> heap;

    public P0703(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();

        for (int num : nums) heap.offer(num);

        while (heap.size() > k) heap.poll();
    }

    public int add(int val) {
        heap.offer(val);

        if (heap.size() > k) heap.poll();

        return heap.peek();
    }
}
