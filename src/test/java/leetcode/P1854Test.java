package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1854Test {

    @Test
    void test1() {
        int[][] logs = new int[][] {{2000, 2010}, {2005, 2015}};
        int expected = 2005;
        P1854 solution = new P1854();
        int actual = solution.maximumPopulation(logs);
        Assertions.assertEquals(expected, actual);
    }
}
