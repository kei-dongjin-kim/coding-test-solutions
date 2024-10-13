package leetcode;

import org.junit.jupiter.api.Test;

public class P0217Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 3, 3, 4, 5};
    P0217 solution = new P0217();
    boolean expected = true;
    boolean actual = solution.containsDuplicate(nums);
    assert expected == actual;
  }
}
