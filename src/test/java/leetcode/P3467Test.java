package leetcode;

import org.junit.jupiter.api.Test;

public class P3467Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {0, 0, 1, 1, 1};
        P3467 solution = new P3467();
        int[] actual = solution.transformArray(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
