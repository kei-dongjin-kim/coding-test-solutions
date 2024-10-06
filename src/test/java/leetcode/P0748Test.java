package leetcode;

import org.junit.jupiter.api.Test;

public class P0748Test {
  
  @Test
  void test1() {
    String licensePlate = "abc123";
    String[] words = new String[] {"xyz", "abc", "abc123"};
    P0748 solution = new P0748();
    String expected = "abc";
    String actual = solution.shortestCompletingWord(licensePlate, words);
    assert(expected.equals(actual));
  }
}
