package leetcode;

import org.junit.jupiter.api.Test;

public class P0709Test {
  
  @Test
  void test1() {
    String s = "aBcDe";
    String expected = "abcde";
    P0709 solution = new P0709();
    String actual = solution.toLowerCase(s);
    assert expected.equals(actual);
  }
}
