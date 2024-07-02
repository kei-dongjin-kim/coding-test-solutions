package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0350Test {

    @Test
    @DisplayName("nums1 = [1,2,3,4], nums2 = [2,3]")
    void test1() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3};
        P0350 solution = new P0350();
        int[] actual = solution.intersect(nums1, nums2);
        int[] expected = {2, 3};
        assert Arrays.equals(actual, expected);
    }
}
