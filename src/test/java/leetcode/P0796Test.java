package leetcode;

import org.junit.jupiter.api.Test;

public class P0796Test {
  
  @Test
  void test1() {
    String s = "abcdef";
    String goal = "defabc";
    boolean expected = true;
    P0796 solution = new P0796();
    boolean actual = solution.rotateString(s,goal);
    assert expected == actual;
  }
}
