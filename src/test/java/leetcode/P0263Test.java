package leetcode;

import org.junit.jupiter.api.Test;

public class P0263Test {
  
  @Test
  void test1() {
    P0263 solution = new P0263();
    assert false == solution.isUgly(11);
  }

  @Test
  void test2() {
    P0263 solution = new P0263();
     assert true == solution.isUgly(10);
  }
}
