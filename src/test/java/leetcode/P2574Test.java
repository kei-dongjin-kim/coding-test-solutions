package leetcode;

import org.junit.jupiter.api.Test;

public class P2574Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {9, 6, 1, 6};
        P2574 solution = new P2574();
        int[] actual = solution.leftRightDifference(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
