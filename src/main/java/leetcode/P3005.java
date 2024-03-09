package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P3005 {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (Integer cnt : map.values()) {
            max = Math.max(max, cnt);
        }
        int result = 0;
        for (Integer cnt : map.values()) {
            if (cnt == max) result += cnt;
        }
        return result;
    }
}
