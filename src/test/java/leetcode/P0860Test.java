package leetcode;

import org.junit.jupiter.api.Test;

public class P0860Test {
  
  @Test
  void test1() {
    int[] bills = {5, 5, 5, 20, 5, 10};
    boolean expected = true;
    P0860 solution = new P0860();
    boolean actual = solution.lemonadeChange(bills);
    assert expected == actual;
  }
}
