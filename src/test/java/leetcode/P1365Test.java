package leetcode;

import org.junit.jupiter.api.Test;

public class P1365Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int [] {0, 1, 2, 3, 4, 5, 6, 7};
        P1365 solution = new P1365();
        int[] actual = solution.smallerNumbersThanCurrent(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
