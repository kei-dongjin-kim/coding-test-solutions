package leetcode;

import org.junit.jupiter.api.Test;

public class P0219Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 3, 4, 5, 1};
    int k = 10;
    boolean expected = true;
    P0219 solution = new P0219();
    boolean actual = solution.containsNearbyDuplicate(nums, k);
    assert expected == actual;
  }
}
