package leetcode;

import org.junit.jupiter.api.Test;

public class P0697Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 2, 8, 9};
    int expected = 7;
    P0697 solution = new P0697();
    int actual = solution.findShortestSubArray(nums);
    assert expected == actual;
  }
}
