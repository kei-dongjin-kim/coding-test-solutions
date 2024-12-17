package leetcode;

import org.junit.jupiter.api.Test;

public class P3046Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 2, 3, 3, 3, 4};
    boolean expected = false;
    P3046 solution = new P3046();
    boolean actual = solution.isPossibleToSplit(nums);
    assert expected == actual;
  }
}
