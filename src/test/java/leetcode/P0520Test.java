package leetcode;

import org.junit.jupiter.api.Test;

public class P0520Test {
  
  @Test
  void test1() {
    P0520 solution = new P0520();
    boolean actual = solution.detectCapitalUse("Test");
    assert(actual);
  }
}
