package leetcode;

import org.junit.jupiter.api.Test;

public class P1175Test {
  
  @Test
  void test1() {
    int n = 6;
    int expected = 36;
    P1175 solution = new P1175();
    int actual = solution.numPrimeArrangements(n);
    assert expected == actual;
  }
}
