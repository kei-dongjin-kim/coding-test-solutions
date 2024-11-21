package leetcode;

import org.junit.jupiter.api.Test;

public class P0504Test {
  
  @Test
  void test1() {
    int num = 101;
    String expected = "203";
    P0504 solution = new P0504();
    String actual = solution.convertToBase7(num);
    assert expected.equals(actual);
  }
}
