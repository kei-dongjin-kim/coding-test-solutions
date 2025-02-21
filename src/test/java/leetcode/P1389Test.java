package leetcode;

import org.junit.jupiter.api.Test;

public class P1389Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int[] index = new int[] {0, 0, 0, 0, 0};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        P1389 solution = new P1389();
        int[] actual = solution.createTargetArray(nums, index);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
