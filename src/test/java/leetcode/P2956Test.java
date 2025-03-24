package leetcode;

import org.junit.jupiter.api.Test;

public class P2956Test {

    @Test
    void test1() {
        int[] nums1 = new int[] {1, 2, 3, 4, 5};
        int[] nums2 = new int[] {5, 5, 5, 5, 5};
        int[] expected = new int[] {1, 5};
        P2956 solution = new P2956();
        int[] actual = solution.findIntersectionValues(nums1, nums2);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
