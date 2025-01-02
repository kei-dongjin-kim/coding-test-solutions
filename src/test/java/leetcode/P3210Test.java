package leetcode;

import org.junit.jupiter.api.Test;

public class P3210Test {

  @Test
  void test1() {
    String s = "abc";
    int k = 10;
    String expected = "bca";
    P3210 solution = new P3210();
    String actual = solution.getEncryptedString(s, k);
    assert actual.equals(expected);
  }
}
