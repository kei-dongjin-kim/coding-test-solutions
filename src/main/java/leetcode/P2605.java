package leetcode;

import java.util.Arrays;

public class P2605 {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min = nums1[0] * 10 + nums2[0];
        min = Math.min(min, nums2[0] * 10 + nums1[0]);
        int[] map = new int[10];
        for (int i : nums1) {
            map[i]++;
        }
        for (int i : nums2) {
            map[i]++;
        }
        for (int i = 1; i < 10; i++) {
            if (map[i] >= 2) {
                return i;
            }
        }
        return min;
    }
}
