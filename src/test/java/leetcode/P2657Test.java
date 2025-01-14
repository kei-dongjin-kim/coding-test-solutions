package leetcode;

import org.junit.jupiter.api.Test;

public class P2657Test {

    @Test
    void test1() {
        int[] A = new int[] {1, 2, 3, 4, 5};
        int[] B = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {1, 2, 3, 4, 5};
        P2657 solution = new P2657();
        int[] actual = solution.findThePrefixCommonArray(A, B);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
