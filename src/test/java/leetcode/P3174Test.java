package leetcode;

import org.junit.jupiter.api.Test;

public class P3174Test {

  @Test
  void test1() {
    String s = "abcde123fg";
    String expected = "abfg";
    P3174 solution = new P3174();
    String actual = solution.clearDigits(s);
    assert expected.equals(actual);
  }
}
