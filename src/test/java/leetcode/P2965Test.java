package leetcode;

import org.junit.jupiter.api.Test;

public class P2965Test {
  
  @Test
  void test1() {
    int[][] grid = {{1, 1}, {2, 3}};
    int[] expected = {1, 4};
    P2965 solution = new P2965();
    int[] actual = solution.findMissingAndRepeatedValues(grid);
    assert (actual[0] == expected[0]) &&  
           (actual[1] == expected[1]);
  }
}
