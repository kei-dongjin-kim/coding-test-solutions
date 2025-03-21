package leetcode;

import org.junit.jupiter.api.Test;

public class P2006Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int k = 3;
        int expected = 2;
        P2006 solution = new P2006();
        int actual = solution.countKDifference(nums, k);
        assert expected == actual;
    }
}
