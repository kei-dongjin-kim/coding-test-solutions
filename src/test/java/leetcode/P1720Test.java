package leetcode;

import org.junit.jupiter.api.Test;

public class P1720Test {

    @Test
    void test1() {
        int[] encoded = new int[] {1, 2, 3, 4, 5};
        int first = 1;
        int[] expected = new int[] {1, 0, 2, 1, 5, 0};
        P1720 solution = new P1720();
        int[] actual = solution.decode(encoded, first);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
