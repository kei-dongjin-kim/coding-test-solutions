package leetcode;

import org.junit.jupiter.api.Test;

public class P2656Test {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int expected = 33;
        P2656 solution = new P2656();
        int actual = solution.maximizeSum(nums, k);
        assert expected == actual;
    }
}
