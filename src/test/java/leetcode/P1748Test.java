package leetcode;

import org.junit.jupiter.api.Test;

public class P1748Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 2, 3, 3, 4, 5};
        int expected = 10;
        P1748 solution = new P1748();
        int actual = solution.sumOfUnique(nums);
        assert expected == actual;
    }
}
