package leetcode;

import org.junit.jupiter.api.Test;

public class P1640Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[][] pieces = new int[][] {{5}, {2, 3, 4}, {1}};
        boolean expected = true;
        P1640 solution = new P1640();
        boolean actual = solution.canFormArray(arr, pieces);
        assert expected == actual;
    }
}
