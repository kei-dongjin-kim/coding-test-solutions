package leetcode;

import org.junit.jupiter.api.Test;

public class P2696Test {
  
  @Test
  void test1() {
    String s = "ABCDEFG";
    P2696 solution = new P2696();
    int expected = 3;
    int actual = solution.minLength(s);
    assert expected == actual;
  }
}
