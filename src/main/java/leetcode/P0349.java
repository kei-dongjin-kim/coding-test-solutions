package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer num : nums1) set1.add(num);
        Set<Integer> set2 = new HashSet<>();
        for (Integer num : nums2) set2.add(num);

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int index = 0;
        for (int s : set1) result[index++] = s;

        return result;
    }
}
