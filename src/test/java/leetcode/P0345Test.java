package leetcode;

import org.junit.jupiter.api.Test;

public class P0345Test {

  @Test
  void test1() {
    String s = "zAzEzIzOzUz";
    String expected = "zUzOzIzEzAz";
    P0345 solution = new P0345();
    String actual = solution.reverseVowels(s);
    assert actual.equals(expected);
  }
}