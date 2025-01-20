package leetcode;

import org.junit.jupiter.api.Test;

public class P3190Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int expected = 5;
        P3190 solution = new P3190();
        int actual = solution.minimumOperations(nums);
        assert expected == actual;
    }
}
