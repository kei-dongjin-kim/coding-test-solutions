package leetcode;

import org.junit.jupiter.api.Test;

public class P3178Test {
  
  @Test
  void test1() {
    int n = 3, k = 7;
    int expected = 1;
    P3178 solution = new P3178();
    int actual = solution.numberOfChild(n, k);
    assert expected == actual;
  }
}
