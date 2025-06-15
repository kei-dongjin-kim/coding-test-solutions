package leetcode;

import java.util.Set;
import java.util.HashSet;

public class P2395 {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (hs.contains(sum)) {
                return true;
            } else {
                hs.add(sum);
            }
        }
        return false;
    }
}
