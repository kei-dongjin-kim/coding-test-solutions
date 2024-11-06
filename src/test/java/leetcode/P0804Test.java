package leetcode;

import org.junit.jupiter.api.Test;

public class P0804Test {
  
  @Test
  void test1() {
    String[] words = {"abc", "gig", "msg", "mgg"};
    int expected = 3;
    P0804 solution = new P0804();
    int actual = solution.uniqueMorseRepresentations(words);
    assert expected == actual;
  }
}
