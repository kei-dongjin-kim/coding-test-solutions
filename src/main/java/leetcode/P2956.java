package leetcode;

public class P2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] map1 = new boolean[101];
        boolean[] map2 = new boolean[101];
        for (int n : nums1) {
            map1[n] = true;
        }
        for (int n : nums2) {
            map2[n] = true;
        }
        int[] result = new int[2];
        for (int n : nums1) {
            if (map2[n]) {
                result[0]++;
            }
        }
        for (int n : nums2) {
            if (map1[n]) {
                result[1]++;
            }
        }
        return result;
    }
}
