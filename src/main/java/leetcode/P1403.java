package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class P1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int curr = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (sum < curr) {
                break;
            } else {
                ans.add(nums[i]);
                curr += nums[i];
                sum -= nums[i];
            }
        }
        return ans;
    }
}
