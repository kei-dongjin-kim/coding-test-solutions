package leetcode;

import org.junit.jupiter.api.Test;

public class P1037Test {
  
  @Test
  void test1() {
    int[][] nums = {{0, 0}, {3, 5}, {7, 1}};
    boolean expected = true;
    P1037 solution = new P1037();
    boolean actual = solution.isBoomerang(nums);
    assert expected == actual;
  }
}
