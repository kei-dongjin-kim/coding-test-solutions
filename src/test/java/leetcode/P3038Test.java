package leetcode;

import org.junit.jupiter.api.Test;

public class P3038Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 2, 1, 3, 0, 7};
        int expected = 3;
        P3038 solution = new P3038();
        int actual = solution.maxOperations(nums);
        assert expected == actual;
    }
}
