package leetcode;

import org.junit.jupiter.api.Test;

public class P0941Test {
  
  @Test
  void test1() {
    int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
    P0941 solution = new P0941();
    boolean result = solution.validMountainArray(arr);
    assert result;
  }
}
