package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.merge(a, 1, Integer::sum);
        }
        int max = -1;
        for (Integer key : map.keySet()) {
            if (map.get(key).equals(key)) {
                max = Math.max(max, key);
            }
        }
        return max;
    }
}
