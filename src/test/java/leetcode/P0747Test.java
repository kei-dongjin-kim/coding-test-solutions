package leetcode;

import org.junit.jupiter.api.Test;

public class P0747Test {
  
  @Test
  void test1() {
    int[] nums = {3, 2, 1, 9};
    P0747 solution = new P0747();
    int expected = 3;
    int actual = solution.dominantIndex(nums);
    assert expected == actual;
  }
}
