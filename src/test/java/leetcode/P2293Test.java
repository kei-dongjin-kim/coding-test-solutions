package leetcode;

import org.junit.jupiter.api.Test;

public class P2293Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int expected = 1;
        P2293 solution = new P2293();
        int actual = solution.minMaxGame(nums);
        assert expected == actual;
    }
}
