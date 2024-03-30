package leetcode;

import java.util.Arrays;

public class P2962 {
    public long countSubarrays(int[] nums, int k) {
        int len = nums.length;

        // We need to know the maximum.
        int maxElement = Arrays.stream(nums).max().getAsInt();

        // Sliding window
        int left = 0;
        int maxElementInWindow = 0;
        long count = 0;
        for (int right=0 ; right<len ; right++) {
            if (nums[right] == maxElement)
                maxElementInWindow++;
            while (k == maxElementInWindow) {
                if (nums[left] == maxElement)
                    maxElementInWindow--;
                left++;
            }
            count += left;
        }

        return count;
    }
}
