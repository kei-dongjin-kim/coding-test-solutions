package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class P2605Test {

    @Test
    void test1() {
        int[] nums1 = new int[] {5, 6, 7, 8, 9};
        int[] nums2 = new int[] {1, 2, 3, 4};
        int expected = 15;
        P2605 solution = new P2605();
        int actual = solution.minNumber(nums1, nums2);
        Assertions.assertEquals(expected, actual);
    }
}
