package leetcode;

import org.junit.jupiter.api.Test;

public class P0292Test {
  
  @Test
  void test1() {
    boolean expected = false;
    P0292 solution = new P0292();
    boolean actual = solution.canWinNim(8);
    assert expected == actual;
  }

  @Test
  void test2() {
    boolean expected = true;
    P0292 solution = new P0292();
    boolean actual = solution.canWinNim(9);
    assert expected == actual;
  }
}
