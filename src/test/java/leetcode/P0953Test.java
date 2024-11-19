package leetcode;

import org.junit.jupiter.api.Test;

public class P0953Test {
  
  @Test
  void test1() {
    String[] words = {"abc", "def", "ghi"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    boolean expected = true;
    P0953 solution = new P0953();
    boolean actual = solution.isAlienSorted(words, order);
    assert expected == actual;
  }
}
