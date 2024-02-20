package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P1337Test {

    @Test
    @DisplayName("mat = \n" +
            "[[1,1,0,0,0],\n" +
            " [1,1,1,1,0],\n" +
            " [1,0,0,0,0],\n" +
            " [1,1,0,0,0],\n" +
            " [1,1,1,1,1]], \n" +
            "k = 3")
    void kWeakestRows_Test1() {
        int[][] mat = new int[][] {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k = 3;
        P1337 solution = new P1337();
        int[] actual = solution.kWeakestRows(mat, k);
        int[] expected = new int[] {2, 0, 3};
        assertArrayEquals(expected, actual);
    }
}
