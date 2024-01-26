package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0088Test {

    @Test
    @DisplayName("[1,2,3,0,0,0], 3, [2,5,6], 3")
    void merge1() {
        P0088 solution = new P0088();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        solution.merge(nums1, 3, nums2, 3);
        assert nums1[0] == 1;
        assert nums1[1] == 2;
        assert nums1[2] == 2;
        assert nums1[3] == 3;
        assert nums1[4] == 5;
        assert nums1[5] == 6;
    }

    @Test
    @DisplayName("[1], 1, [], 0")
    void merge2() {
        P0088 solution = new P0088();
        int[] nums1 = {1};
        int[] nums2 = {};
        solution.merge(nums1, 1, nums2, 0);
        assert nums1[0] == 1;
    }

    @Test
    @DisplayName("[0], 0, [1], 1")
    void merge3() {
        P0088 solution = new P0088();
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);
        assert nums1[0] == 1;
    }

    @Test
    @DisplayName("[4,5,6,0,0,0], 3, [1,2,3], 3")
    void merge4() {
        P0088 solution = new P0088();
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        solution.merge(nums1, 3, nums2, 3);
        assert nums1[0] == 1;
        assert nums1[1] == 2;
        assert nums1[2] == 3;
        assert nums1[3] == 4;
        assert nums1[4] == 5;
        assert nums1[5] == 6;
    }

    @Test
    @DisplayName("[1,2,3,0,0,0], 3, [4,5,6], 3")
    void merge5() {
        P0088 solution = new P0088();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        solution.merge(nums1, 3, nums2, 3);
        assert nums1[0] == 1;
        assert nums1[1] == 2;
        assert nums1[2] == 3;
        assert nums1[3] == 4;
        assert nums1[4] == 5;
        assert nums1[5] == 6;
    }

    @Test
    @DisplayName("[2,0], 1, [1], 1")
    void merge6() {
        P0088 solution = new P0088();
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        solution.merge(nums1, 1, nums2, 1);
        assert nums1[0] == 1;
        assert nums1[1] == 2;
    }
}
