package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P1920Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 5, 4, 3, 2, 1};
        int[] expected = new int[] {0, 1, 2, 3, 4, 5};
        P1920 solution = new P1920();
        int[] actual = solution.buildArray(nums);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
