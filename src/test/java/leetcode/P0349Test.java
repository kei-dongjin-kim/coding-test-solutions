package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0349Test {

    @Test
    @DisplayName("nums1 = [1,2,2,1], nums2 = [2,2]")
    void intersection_Test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        P0349 solution = new P0349();
        int[] actual = solution.intersection(nums1, nums2);
        assert Arrays.equals(expected, actual);
    }
}
