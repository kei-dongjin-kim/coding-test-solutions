package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        int len = nums.length;
        int max = 0;
        int left = -1;
        int right = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (right < len) {
            int count = map.getOrDefault(nums[right], 0) + 1;
            if (count > k) {
                left++;
                map.put(nums[left], map.get(nums[left]) - 1);
            } else {
                map.put(nums[right], count);
                max = Math.max(max, right - left);
                right++;
            }
        }
        return max;
    }
}
