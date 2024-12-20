package leetcode;

import org.junit.jupiter.api.Test;

public class P3360Test {
  
  @Test
  void test1() {
    int n = 10;
    boolean expected = true;
    P3360 solution = new P3360();
    boolean actual = solution.canAliceWin(n);
    assert expected == actual;
  }
}
