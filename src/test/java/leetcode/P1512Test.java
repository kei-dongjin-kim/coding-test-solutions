package leetcode;

import org.junit.jupiter.api.Test;

public class P1512Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 1, 1, 2, 2, 3};
        int expected = 4;
        P1512 solution = new P1512();
        int actual = solution.numIdenticalPairs(nums);
        assert expected == actual;
    }
}
