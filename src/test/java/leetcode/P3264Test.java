package leetcode;

import org.junit.jupiter.api.Test;

public class P3264Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int k = 3;
        int multiplier = 2;
        int[] expected = new int[] {4, 4, 3, 4, 5};
        P3264 solution = new P3264();
        int[] actual = solution.getFinalState(nums, k, multiplier);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
