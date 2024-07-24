package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class P2191 {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int n : nums) {
            int copied = n;
            int p = 1;
            int mapped = 0;
            if (copied == 0) {
                mapped = mapping[0];
            } else {
                while (copied > 0) {
                    int curr = copied % 10;
                    mapped += mapping[curr] * p;
                    copied /= 10;
                    p *= 10;
                }
            }
            map.computeIfAbsent(mapped, k -> new ArrayList<>()).add(n);
        }
        int[] result = new int[nums.length];
        int idx = 0;
        for (List<Integer> val : map.values()) {
            for (Integer curr : val) {
                result[idx++] = curr;
            }
        }
        return result;
    }
}
