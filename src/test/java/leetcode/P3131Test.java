package leetcode;

import org.junit.jupiter.api.Test;

public class P3131Test {

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};
        int expected = 2;
        P3131 solution = new P3131();
        int actual = solution.addedInteger(nums1, nums2);
        assert expected == actual;
    }
}
