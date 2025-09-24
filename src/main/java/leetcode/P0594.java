package leetcode;

import java.util.*;

public class P0594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        int max = 0;
        int previous = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (Math.abs(key - previous) == 1) {
                max = Math.max(max, map.get(key) + map.get(previous));
            }
            previous = key;
        }
        return max;
    }
}
