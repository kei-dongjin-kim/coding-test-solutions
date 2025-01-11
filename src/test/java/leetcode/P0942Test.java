package leetcode;

import org.junit.jupiter.api.Test;

public class P0942Test {

    @Test
    void test1() {
        String s = "DIDI";
        int[] expected = new int[] {4, 0, 3, 1, 2};
        P0942 solution = new P0942();
        int[] actual = solution.diStringMatch(s);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
