package leetcode;

import org.junit.jupiter.api.Test;

public class P2465Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int expected = 2;
        P2465 solution = new P2465();
        int actual = solution.distinctAverages(nums);
        assert expected == actual;
    }
}
