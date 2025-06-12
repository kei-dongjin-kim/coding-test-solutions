package leetcode;

import org.junit.jupiter.api.Test;

public class P2460Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 0, 1, 1, 2, 2, 3, 3};
        int[] expected = new int[] {2, 4, 6, 0, 0, 0, 0, 0};
        P2460 solution = new P2460();
        int[] actual = solution.applyOperations(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
