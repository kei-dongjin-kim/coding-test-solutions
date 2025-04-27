package leetcode;

import org.junit.jupiter.api.Test;

public class P1304Test {

    @Test
    void test1() {
        int n = 7;
        P1304 solution = new P1304();
        int[] actual = solution.sumZero(n);
        int expectedSum = 0;
        int actualSum = 0;
        for (int i = 0; i < actual.length; i++) {
            actualSum += actual[i];
        }
        assert expectedSum == actualSum;
    }
}
