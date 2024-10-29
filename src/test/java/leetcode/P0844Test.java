package leetcode;

import org.junit.jupiter.api.Test;

public class P0844Test {
  
  @Test
  void test1() {
    String s = "ax#c";
    String t = "ay#z#c";
    boolean expected = true;
    P0844 solution = new P0844();
    boolean actual = solution.backspaceCompare(s, t);
    assert expected == actual;
  }
}
