package leetcode;

import org.junit.jupiter.api.Test;

public class P0414Test {
  
  @Test
  void test1() {
    int[] nums = {100, 1, -2147483648};
    P0414 solution = new P0414();
    int expected = -2147483648;
    int actual = solution.thirdMax(nums);
    assert expected == actual;     
  }
}
