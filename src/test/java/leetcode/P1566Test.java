package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1566Test {

    @Test
    void test1() {
        int[] arr = new int[] {0, 1, 2, 3, 4, 2, 3, 4, 8, 9};
        int m = 3;
        int k = 2;
        boolean expected = true;
        P1566 solution = new P1566();
        boolean actual = solution.containsPattern(arr, m, k);
        Assertions.assertEquals(expected, actual);
    }
}
