package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int n : nums) {
            int count = map.merge(n, 1, Integer::sum);
            if (count > majorityCount) {
                return n;
            }
        }
        return -1;
    }
}
