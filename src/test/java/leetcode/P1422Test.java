package leetcode;

import org.junit.jupiter.api.Test;

public class P1422Test {
  
  @Test
  void test1() {
    String s = "0111111111";
    int expected = 10;
    P1422 solution = new P1422();
    int actual = solution.maxScore(s);
    assert expected == actual;
  }
}
