package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        // sum is the number of odd numbers in the array
        for (int n : nums) {
            sum += n % 2;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
