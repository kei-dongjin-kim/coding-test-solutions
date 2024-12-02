package leetcode;

import org.junit.jupiter.api.Test;

public class P0461Test {
  
  @Test
  void test1() {
    int x = 2, y = 4;
    int expected = 1;
    P0461 solution = new P0461();
    int actual = solution.hammingDistance(x, y);
    assert expected == actual;
  }
}
