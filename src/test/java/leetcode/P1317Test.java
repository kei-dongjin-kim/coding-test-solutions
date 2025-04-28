package leetcode;

import org.junit.jupiter.api.Test;

public class P1317Test {

    @Test
    void test1() {
        int n = 111;
        int[] expected = new int[] {12, 99};
        P1317 solution = new P1317();
        int[] actual = solution.getNoZeroIntegers(n);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
