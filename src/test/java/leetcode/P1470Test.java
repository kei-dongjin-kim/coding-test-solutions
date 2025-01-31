package leetcode;

import org.junit.jupiter.api.Test;

public class P1470Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5};
        int n = 3;
        int[] expected = new int[] {0, 3, 1, 4, 2, 5};
        P1470 solution = new P1470();
        int[] actual = solution.shuffle(nums, n);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
