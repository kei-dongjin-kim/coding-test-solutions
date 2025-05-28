package leetcode;

import org.junit.jupiter.api.Test;

public class P1652Test {

    @Test
    void test1() {
        int[] code = new int[] {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = new int[] {5, 7, 9, 6, 3};
        P1652 solution = new P1652();
        int[] actual = solution.decrypt(code, k);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
