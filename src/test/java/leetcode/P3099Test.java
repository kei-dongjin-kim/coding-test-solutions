package leetcode;

import org.junit.jupiter.api.Test;

public class P3099Test {
  
  @Test
  void test1() {
    int x = 1234;
    int expected = -1;
    P3099 solution = new P3099();
    int actual = solution.sumOfTheDigitsOfHarshadNumber(x);
    assert expected == actual;
  }
}
