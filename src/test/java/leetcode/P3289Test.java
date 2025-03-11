package leetcode;

import org.junit.jupiter.api.Test;

public class P3289Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 3, 4};
        int[] expected = new int[] {3, 4};
        P3289 solution = new P3289();
        int[] actual = solution.getSneakyNumbers(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
