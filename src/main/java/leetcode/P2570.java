package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class P2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] a : nums1) {
            map.merge(a[0], a[1], Integer::sum);
        }
        for (int[] a : nums2) {
            map.merge(a[0], a[1], Integer::sum);
        }
        int[][] result = new int[map.size()][2];
        int idx = 0;
        for (Integer key : map.keySet()) {
            result[idx] = new int[] {key, map.get(key)};
            idx++;
        }
        return result;
    }
}
