package leetcode;

import org.junit.jupiter.api.Test;

public class P1154Test {
  
  @Test
  void test1() {
    String date = "2019-02-09";
    int expected = 40;
    P1154 solution = new P1154();
    int actual = solution.dayOfYear(date);
    assert expected == actual;
  }
}
