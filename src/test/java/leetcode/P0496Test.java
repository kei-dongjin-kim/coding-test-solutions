package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0496Test {

    @Test
    void test1() {
        int[] nums1 = new int[] {1, 2, 3};
        int[] nums2 = new int[] {3, 5, 4, 2, 1};
        int[] expected = new int[] {-1, -1, 5};
        P0496 solution = new P0496();
        int[] actual = solution.nextGreaterElement(nums1, nums2);
        Assertions.assertArrayEquals(expected, actual);
    }
}
