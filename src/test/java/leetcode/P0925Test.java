package leetcode;

import org.junit.jupiter.api.Test;

public class P0925Test {
  
  @Test
  void test1() {
    String name = "abc";
    String typed = "aabbcc";
    boolean expected = true;
    P0925 solution = new P0925();
    boolean actual = solution.isLongPressedName(name, typed);
    assert expected == actual;
  }
}
