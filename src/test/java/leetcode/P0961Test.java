package leetcode;

import org.junit.jupiter.api.Test;

public class P0961Test {
  
  @Test
  void test1() {
    int[] nums = {2, 1, 2, 3, 2, 4, 2, 5};
    int expected = 2;
    P0961 solution = new P0961();
    int actual = solution.repeatedNTimes(nums);
    assert expected == actual;
  }
}
