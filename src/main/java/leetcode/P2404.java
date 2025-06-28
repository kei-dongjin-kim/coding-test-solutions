package leetcode;

import java.util.Map;
import java.util.HashMap;

public class P2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                map.merge(n, 1, Integer::sum);
            }
        }
        int max_key = -1;
        int max_val = -1;
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            if (val > max_val) {
                max_key = key;
                max_val = val;
            } else if ( val == max_val) {
                if (key < max_key) {
                    max_key = key;
                }
            }
        }
        return max_key;
    }
}
