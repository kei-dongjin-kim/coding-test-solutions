package leetcode;

import org.junit.jupiter.api.Test;

public class P0883Test {
  
  @Test
  void test1() {
    int[][] grid = {{0, 1, 2}, {3, 4, 5,}};
    int expected = 24;
    P0883 solution = new P0883();
    int actual = solution.projectionArea(grid);
    assert expected == actual;
  }
}
