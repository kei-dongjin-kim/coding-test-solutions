package leetcode;

import org.junit.jupiter.api.Test;

public class P3114Test {
  
  @Test
  void test1() {
    String s = "?9:??";
    String expected = "09:59";
    P3114 solution = new P3114();
    String actual = solution.findLatestTime(s);
    assert expected.equals(actual);
  }
}
