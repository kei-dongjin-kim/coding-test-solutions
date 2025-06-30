package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P1356Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {1, 2, 4, 3, 5};
        P1356 solution = new P1356();
        int[] actual = solution.sortByBits(arr);
        assert Arrays.equals(expected, actual);
    }
}
