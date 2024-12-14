package leetcode;

import org.junit.jupiter.api.Test;

public class P3000Test {
  
  @Test
  void test1() {
    int[][] dimensions = {{1, 2}, {3, 4}, {5, 6}};
    int expected = 30;
    P3000 solution = new P3000();
    int actual = solution.areaOfMaxDiagonal(dimensions);
    assert expected == actual;
  }
}
