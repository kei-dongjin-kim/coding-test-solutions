package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2600Test {

    @Test
    void test1() {
        int numOnes = 3;
        int numZeros = 3;
        int numNegOnes = 3;
        int k = 7;
        int expected = 2;
        P2600 solution = new P2600();
        int actual = solution.kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);
        Assertions.assertEquals(expected, actual);
    }
}
