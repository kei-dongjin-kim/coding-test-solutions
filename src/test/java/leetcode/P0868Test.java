package leetcode;

import org.junit.jupiter.api.Test;

public class P0868Test {
  
  @Test
  void test1() {
    int n = 9;
    int expected = 3;
    P0868 solution = new P0868();
    int actual = solution.binaryGap(n);
    assert expected == actual;
  }
}
