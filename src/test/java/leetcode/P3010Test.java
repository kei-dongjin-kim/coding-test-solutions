package leetcode;

import org.junit.jupiter.api.Test;

public class P3010Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 1, 1};
        int expected = 3;
        P3010 solution = new P3010();
        int actual = solution.minimumCost(nums);
        assert expected == actual;
    }
}
