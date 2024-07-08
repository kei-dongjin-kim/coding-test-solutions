package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class P1823 {
    public int findTheWinner(int n, int k) {
        // LinkedList is better than ArrayList for this problem
        // because we need to remove the front element
        // and add it to the end of the list
        // LinkedList has O(1) time complexity for these operations
        // while ArrayList has O(n) time complexity
        // for the same operations
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                // move the front element to the end
                queue.add(queue.poll());
            }
            // remove the front element
            queue.poll();
        }

        return queue.peek();
    }
}
