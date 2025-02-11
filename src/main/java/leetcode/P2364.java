package leetcode;

import java.util.Map;
import java.util.HashMap;

public class P2364 {
    public long countBadPairs(int[] nums) {
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = i - nums[i];
            int good = map.getOrDefault(diff, 0);
            count += i - good;
            map.put(diff, good + 1);
        }
        return count;
    }
}
