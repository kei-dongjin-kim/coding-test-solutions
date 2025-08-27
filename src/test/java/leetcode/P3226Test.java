package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3226Test {

    @Test
    void test1() {
        int n = 31;
        int k = 21;
        int expected = 2;
        P3226 solution = new P3226();
        int actual = solution.minChanges(n, k);
        Assertions.assertEquals(expected, actual);
    }
}
