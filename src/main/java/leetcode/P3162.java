package leetcode;

public class P3162 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int quotient = nums1[i] / (nums2[j] * k);
                int remainder = nums1[i] % (nums2[j] * k);
                if (quotient > 0 && remainder == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
