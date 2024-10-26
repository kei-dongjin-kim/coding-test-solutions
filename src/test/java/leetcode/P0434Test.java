package leetcode;

import org.junit.jupiter.api.Test;

public class P0434Test {
  
  @Test
  void test1() {
    String s = "I'm not sure what I'm supposed to do here.";
    P0434 solution = new P0434();
    int expected = 9;
    int actual = solution.countSegments(s);
    assert expected == actual;
  }
}
