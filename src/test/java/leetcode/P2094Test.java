package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2094Test {

    @Test
    void test1() {
        int[] digits = new int[] {1, 2, 3};
        int[] expected = new int[] {132, 312};
        P2094 solution = new P2094();
        int[] actual = solution.findEvenNumbers(digits);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
