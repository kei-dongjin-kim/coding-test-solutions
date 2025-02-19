package leetcode;

import org.junit.jupiter.api.Test;

public class P3162Test {

    @Test
    void test1() {
        int[] nums1 = new int[] {1, 2, 4};
        int[] nums2 = new int[] {1, 2, 4};
        int k = 1;
        int expected = 6;
        P3162 solution = new P3162();
        int actual = solution.numberOfPairs(nums1, nums2, k);
        assert expected == actual;
    }
}
