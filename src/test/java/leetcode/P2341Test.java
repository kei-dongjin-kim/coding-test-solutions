package leetcode;

import org.junit.jupiter.api.Test;

public class P2341Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 2, 2, 3, 4, 5};
        int[] expected = new int[] {1, 5};
        P2341 solution = new P2341();
        int[] actual = solution.numberOfPairs(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
