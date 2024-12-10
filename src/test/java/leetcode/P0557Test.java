package leetcode;

import org.junit.jupiter.api.Test;

public class P0557Test {
  
  @Test
  void test1() {
    String s = "abc def ghi";
    String expected = "cba fed ihg";
    P0557 solution = new P0557();
    String actual = solution.reverseWords(s);
    assert expected.equals(actual);
  }
}
