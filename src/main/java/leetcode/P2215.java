package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean[] map1 = new boolean[2002];
        boolean[] map2 = new boolean[2002];
        for (int n : nums1) {
            map1[n + 1000] = true;
        }
        for (int n : nums2) {
            map2[n + 1000] = true;
        }
        for (int n : nums1) {
            if (!list1.contains(n) && !map2[n + 1000]) {
                list1.add(n);
            }
        }
        for (int n : nums2) {
            if (!list2.contains(n) && !map1[n + 1000]) {
                list2.add(n);
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
