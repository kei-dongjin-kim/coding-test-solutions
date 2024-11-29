package leetcode;

import org.junit.jupiter.api.Test;

public class P0766Test {
  
  @Test
  void test1() {
    int[][] matrix = {{ 3, 4, 5}, {2, 3, 4}, {1, 2, 3}};
    boolean expected = true;
    P0766 solution = new P0766();
    boolean actual = solution.isToeplitzMatrix(matrix);
    assert expected == actual;
  }
}
