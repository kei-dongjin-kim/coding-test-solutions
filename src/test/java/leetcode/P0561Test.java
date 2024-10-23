package leetcode;

import org.junit.jupiter.api.Test;

public class P0561Test {
  
  @Test
  void test1() {
    int[] nums = {6, 5, 4, 3, 2, 1};
    int expected = 9;
    P0561 solution = new P0561();
    int actual = solution.arrayPairSum(nums);
    assert expected == actual;
  }
}
