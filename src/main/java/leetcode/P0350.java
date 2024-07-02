package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        int index1 = 0;
        int index2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                result[i++] = nums1[index1];
                index1++;
                index2++;
            } else {
                if (nums1[index1] > nums2[index2]) {
                    index2++;
                } else {
                    index1++;
                }
            }
        }
        return Arrays.copyOf(result, i);
    }
}
