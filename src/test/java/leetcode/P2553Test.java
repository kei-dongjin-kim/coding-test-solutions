package leetcode;

import org.junit.jupiter.api.Test;

public class P2553Test {

    @Test
    void test1() {
        int[] nums = {123, 456, 789};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        P2553 solution = new P2553();
        int[] actual = solution.separateDigits(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
