package leetcode;

import org.junit.jupiter.api.Test;

public class P3270Test {
  
  @Test
  void test1() {
    int num1 = 888;
    int num2 = 999;
    int num3 = 111;
    int expected = 111;
    P3270 solution = new P3270();
    int actual = solution.generateKey(num1, num2, num3);
    assert expected == actual;
  }
}
