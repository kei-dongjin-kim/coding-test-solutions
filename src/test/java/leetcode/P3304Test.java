package leetcode;

import org.junit.jupiter.api.Test;

public class P3304Test {
  
  @Test
  void test1() {
    int k = 8;
    char expected = 'd';
    P3304 solution = new P3304();
    char actual = solution.kthCharacter(k);
    assert expected == actual;
  }
}
