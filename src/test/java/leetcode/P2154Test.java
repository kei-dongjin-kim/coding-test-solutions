package leetcode;

import org.junit.jupiter.api.Test;

public class P2154Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 4, 8, 16, 20};
        int original = 1;
        int expected = 32;
        P2154 solution = new P2154();
        int actual = solution.findFinalValue(nums, original);
        assert expected == actual;
    }
}
