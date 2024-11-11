package leetcode;

import org.junit.jupiter.api.Test;

public class P0507Test {
  
  @Test
  void test1() {
    int num = 28;
    boolean expected = true;
    P0507 solution = new P0507();
    boolean actual = solution.checkPerfectNumber(num);
    assert expected == actual;
  }
}
