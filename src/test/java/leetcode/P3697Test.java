package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3697Test {

    @Test
    void test1() {
        int n = 123;
        int[] expected = new int[] {100, 20, 3};
        P3697 solution = new P3697();
        int[] actual = solution.decimalRepresentation(n);
        Assertions.assertArrayEquals(expected, actual);
    }
}
