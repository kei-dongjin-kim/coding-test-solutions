package leetcode;

import org.junit.jupiter.api.Test;

public class P1913Test {

    @Test
    void test1() {
        int[] nums = new int[] {5, 4, 3, 2, 1};
        int expected = 18;
        P1913 solution = new P1913();
        int actual = solution.maxProductDifference(nums);
        assert expected == actual;
    }
}
