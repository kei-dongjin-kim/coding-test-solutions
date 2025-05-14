package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        int sum = 0;
        for (Integer key : map.keySet()) {
            Integer val = map.get(key);
            if (val == 1) {
                sum += key;
            }
        }
        return sum;
    }
}
