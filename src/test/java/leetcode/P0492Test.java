package leetcode;

import org.junit.jupiter.api.Test;

public class P0492Test {
  
  @Test
  void test1() {
    int area = 7;
    int[] expected = new int[] {7, 1};
    P0492 solution = new P0492();
    int[] actual = solution.constructRectangle(area);
    assert expected[0] == actual[0] && expected[1] == actual[1];
  }
}
