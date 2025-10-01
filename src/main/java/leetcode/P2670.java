package leetcode;

import java.util.Map;
import java.util.HashMap;

public class P2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        int len = nums.length;
        int[] ans = new int[len];
        for (int n : nums) {
            right.merge(n, 1, Integer::sum);
        }
        for (int i = 0; i < len; i++) {
            left.merge(nums[i], 1, Integer::sum);
            if (right.get(nums[i]) <= 1) {
                right.remove(nums[i]);
            } else {
                right.merge(nums[i], -1, Integer::sum);
            }
            ans[i] = left.size() - right.size();
        }
        return ans;
    }
}
