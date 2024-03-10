package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2540Test {

    @Test
    @DisplayName("nums1 = [1,2,3], nums2 = [2,4]")
    void getCommon_Test1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        P2540 solution = new P2540();
        int expected = 2;
        int actual = solution.getCommon(nums1, nums2);
        assert expected == actual;
    }
}
