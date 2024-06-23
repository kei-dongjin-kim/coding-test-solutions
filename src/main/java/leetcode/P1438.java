package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class P1438 {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new LinkedList<>();
        Deque<Integer> min = new LinkedList<>();
        int left = 0;
        int maxlength = 0;
        for (int right=0 ; right<nums.length ; ++right) {
            while (!max.isEmpty() && max.peekLast() < nums[right]) {
                max.pollLast();
            }
            max.offerLast(nums[right]);

            while (!min.isEmpty() && min.peekLast() > nums[right]) {
                min.pollLast();
            }
            min.offerLast(nums[right]);

            while (max.peekFirst() - min.peekFirst() > limit) {
                if (max.peekFirst() == nums[left]) {
                    max.pollFirst();
                }
                if (min.peekFirst() == nums[left]) {
                    min.pollFirst();
                }
                ++left;
            }

            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;
    }
}
