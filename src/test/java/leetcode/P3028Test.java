package leetcode;

import org.junit.jupiter.api.Test;

public class P3028Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 3, -3, -2, -1, 1, 2, 3};
    int expected = 1;
    P3028 solution = new P3028();
    int actual = solution.returnToBoundaryCount(nums);
    assert expected == actual;
  }
}
