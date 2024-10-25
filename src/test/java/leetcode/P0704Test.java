package leetcode;

import org.junit.jupiter.api.Test;

public class P0704Test {
  
  @Test
  void test1() {
    int[] nums ={1, 2, 3, 4, 5};
    int target = 5;
    P0704 solution = new P0704();
    int expected = 4;
    int actual = solution.search(nums, target);
    assert expected == actual;
  }
}
