package leetcode;

import org.junit.jupiter.api.Test;

public class P0896Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean expected = true;
    P0896 solution = new P0896();
    boolean actual = solution.isMonotonic(nums);
    assert expected == actual;
  }
}
