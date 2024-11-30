package leetcode;

import org.junit.jupiter.api.Test;

public class P0455Test {
  
  @Test
  void test1() {
    int[] g = {3, 2, 1};
    int[] s = {2, 2, 1};
    int expected = 2;
    P0455 solution = new P0455();
    int actual = solution.findContentChildren(g, s);
    assert expected == actual;
  }
}
