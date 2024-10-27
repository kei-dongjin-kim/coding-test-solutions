package leetcode;

import org.junit.jupiter.api.Test;

public class P0680Test {
  
  @Test
  void test1() {
    String s = "jaba";
    P0680 solution = new P0680();
    boolean expected = true;
    boolean actual = solution.validPalindrome(s);
    assert expected == actual;
  }
}
