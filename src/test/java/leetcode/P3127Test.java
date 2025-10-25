package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3127Test {

    @Test
    void test1() {
        char[][] grid =  new char[][] {
            {'B', 'W', 'B'},
            {'B', 'W', 'W'},
            {'W', 'B', 'B'}
        };
        boolean expected = true;
        P3127 solution = new P3127();
        boolean actual = solution.canMakeSquare(grid);
        Assertions.assertEquals(expected, actual);
    }
}
