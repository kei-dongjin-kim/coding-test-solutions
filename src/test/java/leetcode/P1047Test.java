package leetcode;

import org.junit.jupiter.api.Test;

public class P1047Test {
  
  @Test
  void test1() {
    String s = "abcccdef";
    String expected = "abcdef";
    P1047 solution = new P1047();
    String actual = solution.removeDuplicates(s);
    assert expected.equals(actual);
  }
}
