package leetcode;

import org.junit.jupiter.api.Test;

public class P0190Test {
  
  @Test
  void Test1() {
    int n = 1;
    P0190 solution = new P0190();
    int expected = -2147483648;
    int actual = solution.reverseBits(n);
    assert expected == actual;
  }
}
