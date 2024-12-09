package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class P0566Test {
  
  @Test
  void test1() {
    int[][] mat = {{1, 2}, {3, 4}};
    int r = 4;
    int c = 1;
    int[][] expected = {{1}, {2}, {3}, {4}};
    P0566 solution = new P0566();
    int[][] actual = solution.matrixReshape(mat, r, c);
    assertArrayEquals(expected, actual);
  }
}
